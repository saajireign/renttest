package com.pub.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

@Repository("helper")
public class ReflectHelper {
	/**
	 * 从object中得到String，Object的map
	 * @param obj欲转化的object
	 * @return 转化后的map
	 */
	public Map<String, Object> getMapFromObj(Object obj) {
		Map<String, Object> map = new HashMap<String, Object>();
		Class<?> object = obj.getClass();//得到对象运行时类
		Field[] field = object.getDeclaredFields();//得到所有的属性（包括方法，不包括父类的方法和属性）
		for (int i = 0; i < field.length; i++) {
			if (getter(obj, field[i].getName()) == null) {//通过属性名得到属性的值，如果是方法或者空值的话就continue
				continue;
			} else if (isFieldTypeSet(field[i])) {//判断是否为集合Set，如果是set的话不进行处理。
				continue;
//			} else if (isFieldTypeBoolean(field[i])) {//Boolean
//				map.put(field[i].getName(),
//						(Boolean) getter(obj, field[i].getName()) ? 1 : 0);
			} else {
				map.put(field[i].getName(), getter(obj, field[i].getName()));
			}
		}
		return map;
	}
/**
 * 通过对象实体得到对象中给定属性名对应值
 * @param obj-欲得到属性值的对象的实体
 * @param attr-属性名
 * @return-得到的值
 */
	public Object getter(Object obj, String attr) {
		try {
			Method method = obj.getClass().getMethod("get" + initStr(attr));//通过initStr方法将属性的首字母大写然后通过方法名得到方法
			return (Object) (method.invoke(obj));//执行方法
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
/**
 * 首字母大写
 * @param oldString-属性名
 * @return-首字母大写的属性名
 */
	public String initStr(String oldString) {
		String newString = oldString.substring(0, 1).toUpperCase()
				+ oldString.substring(1);
		return newString;
	}
/**
 * 因为Date很难通过String的值调用newInstance方法来构造因此，如果是日期类型的话，就调用此方法。
 * @param obj-欲设置日期属性的对象
 * @param attr-日期属性的名称
 * @param value-日期值
 * @param type-日期的类型（日期）
 */
	public void setDate(Object obj, String attr, Date value, Class<?> type) {
		try {
			Method met = obj.getClass().getMethod("set" + initStr(attr), type);
			met.invoke(obj, value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
/**
 * 根据属性名称设置对象中属性的值，属性对象：string
 * @param obj-预设属性值的对象
 * @param att-属性名称
 * @param value-属性值（字符串）
 * @param type-属性的类型
 */
	public void setter(Object obj, String att, String value, Class<?> type) {
		try {
			Method met = obj.getClass().getMethod("set" + initStr(att), type);
			met.invoke(obj, getObjectByString(type, value));//getobjectbystring就是通过string来初始化object（大部分object都没问题）
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
/**
 * 根据属性名称设置对象中属性的值，属性对象：Object
 * @param obj-预设属性值的对象
 * @param att-属性名称
 * @param value-属性值（Object）
 * @param type-属性的类型
 */
	public void setter(Object obj, String att, Object value, Class<?> type) {
		try {
			Method met = obj.getClass().getMethod("set" + initStr(att), type);
			met.invoke(obj, getObjectByObject(type, value));//通过对象得到某一对象的实例值
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
/**
 * 通过Object构造另外一个Object
 * @param type-对象类型
 * @param value-对象值
 * @return 实例化后的对象
 */
	public Object getObjectByObject(Class<?> type, Object value) {
		Object obj = null;
		try {
			Constructor<?> constrct = type.getConstructor(Object.class);
			obj = constrct.newInstance(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}
/**
 * 通过一个Map得到Object
 * @param map-传入的map
 * @param obj-欲要初始化的object
 */
	public void initObjectByMap(Map<String, Object> map, Object obj) {
		if (map != null) {
			Set entry = map.entrySet();
			Iterator iter = entry.iterator();
			while (iter.hasNext()) {
				Map.Entry<String, Object> mapEntry = (Map.Entry<String, Object>) iter
						.next();
				if (mapEntry.getKey() != null) {
					Field field = getFieldByName(mapEntry.getKey(), obj);
					Class<?> type = field.getType();
					if (isFieldTypeDate(field)) {

						setDate(obj, mapEntry.getKey(),
								(Date) mapEntry.getValue(), type);
					} else {
						setter(obj, mapEntry.getKey(),
								String.valueOf(mapEntry.getValue()), type);
					}
				}
			}
		}
		return;
	}

	/**
	 * 由于oracle中的字段均为大写，故而如果需要将map转化为实体类需要多走一步，即，先把找到对应的field然后再set入object
	 * 
	 * @param map
	 *            ：从oracle中得到的map
	 * @param obj
	 *            ：传入的obj实体（实例化，但尚未初始化）
	 */
	public void initObjectByOracleMap(Map<String, Object> map, Object obj) {
		if (map != null) {
			Set entry = map.entrySet();
			Iterator iter = entry.iterator();
			/**
			 * 遍历oraclemap
			 */
			while (iter.hasNext()) {
				Map.Entry<String, Object> mapEntry = (Map.Entry<String, Object>) iter
						.next();
				if (mapEntry.getKey() != null) {
					Field field = null;// 保存与key相对应的变量。
					Field[] fields = getFields(obj);// 用来遍历Feild
					for (Field fieldy : fields) {
						if (fieldy.getName().toUpperCase()
								.equals(mapEntry.getKey())) {// 如果field的名称大写与map的key相同则表明找到了key对应的field。
							field = fieldy;
							break;
						}
					}
					if (field != null) {
						Class<?> type = field.getType();
						if (isFieldTypeDate(field)) {// 因为日期不能调用setter的Object方法，因此要额外调用setDate方法

							setDate(obj, field.getName(),
									(Date) mapEntry.getValue(), type);
						} else {
							setter(obj, field.getName(),
									String.valueOf(mapEntry.getValue()), type);
						}
					}
				}
			}
		}
		return;
	}

	public Object getObjectByString(Class<?> type, String value) {
		Object obj = null;
		try {
			Constructor<?> constrct = type.getConstructor(String.class);
			obj = constrct.newInstance(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}
	/**
	 * 得到类中所有的方法和属性的Field（不可以是父类的）
	 * @param obj-欲得到Field的对象
	 * @return-Field的数组
	 */
	public Field[] getFields(Object obj) {
		Class<?> object = obj.getClass();
		Field[] field = object.getDeclaredFields();
		return field;
	}
	/**
	 * 通过Field的名称得到Field
	 * @param name
	 * @param obj
	 * @return
	 */
	public Field getFieldByName(String name, Object obj) {
		Class<?> object = obj.getClass();
		try {
			Field field = object.getDeclaredField(name);
			return field;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Boolean isFieldTypeBoolean(Field field) {
		if (field.getType().isInstance(Boolean.class)) {
			return true;
		}
		return false;
	}

	public Boolean isFieldTypeInt(Field field) {
		if (field.getType().getName().trim().equals("java.lang.Integer")) {
			return true;
		}
		return false;
	}

	public Boolean isFieldTypeSet(Field field) {
		if (field.getType().getName().trim().equals("java.util.Set")) {
			return true;
		}
		return false;
	}

	public Boolean isFieldTypeDate(Field field) {
		if (field.getType().getName().trim().equals("java.util.Date")) {
			return true;
		}
		return false;
	}
	
	/**
	 * 通过反射,获得指定类的父类的第一个泛型参数的实际类型. 如BuyerServiceBean extends DaoSupport<Buyer>
	 * 
	 * @param myclass 需要反射的类,该类必须继承泛型父类
	 * @return 泛型参数的实际类型, 如果没有实现ParameterizedType接口，即不支持泛型，所以直接返回:<code>Object.class</code>
	 */
	@SuppressWarnings("unchecked")
	public static Class getSuperClassGenricType(Class myclass) {
		return getSuperClassGenricType(myclass, 0);
	}
	
	/**
	 * 通过反射,获得指定类的父类的泛型参数的实际类型. 如BuyerServiceBean extends DaoSupport<Buyer>
	 * 
	 * @param myclass 需要反射的类,该类必须继承范型父类
	 * @param index 泛型参数所在索引,从0开始.
	 * @return 范型参数的实际类型, 如果没有实现ParameterizedType接口，即不支持泛型，所以直接返回:<code>Object.class</code>
	 */
	@SuppressWarnings("unchecked")
	public static Class getSuperClassGenricType(Class myclass, int index) {
		Type genType = myclass.getGenericSuperclass();// 得到泛型父类
		// 如果没有实现ParameterizedType接口，即不支持泛型，直接返回Object.class
		if (!(genType instanceof ParameterizedType)) {
			return Object.class;
		}
		// 返回表示此类型实际类型参数的Type对象的数组,数组里放的都是对应类型的Class, 如BuyerServiceBean extends
		// DaoSupport<Buyer,Contact>就返回Buyer和Contact类型
		Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
		if (index >= params.length || index < 0) {
			throw new RuntimeException("你输入的索引" + (index < 0 ? "不能小于0" : "超出了参数的总数"));
		}
		if (!(params[index] instanceof Class)) {
			return Object.class;
		}
		return (Class) params[index];
	}
	public Object getObjectByRsAndClass(ResultSet rs,Object obj) throws SQLException{
		
		Field[] fields=getFields(obj);
		for(Field field:fields)
		{
			if(rs.getObject(field.getName())!=null)
			{
				if(isFieldTypeBoolean(field)){
					Double tempd=rs.getDouble(field.getName());
					Integer tmpint1=Integer.valueOf(tempd.intValue());
					Object isboolean=getObjectByString(Integer.class,String.valueOf(tmpint1));
					if(Integer.valueOf(String.valueOf((Integer)isboolean))==0){
						setter(obj,field.getName(),"false",Boolean.class);
					}else{
						setter(obj,field.getName(),"true",Boolean.class);
					}
//					System.out.println(field.getName()+"is boolean");
				}else if(isFieldTypeInt(field)){
					Double temp=rs.getDouble(field.getName());
					Integer tmpint=Integer.valueOf(temp.intValue());
					setter(obj,field.getName(),String.valueOf(tmpint).trim(), field.getType());
//					System.out.println(field.getName()+"is int");
				}
				else{
					setter(obj,field.getName(),String.valueOf(rs.getObject(field.getName())).trim(),field.getType());
				}
			}
		}
//		System.out.println(obj);
		return obj;
		}
		public Boolean isFieldTypeDouble(Field field){
			if(field.getType().getName().trim().equals("java.lang.Double")){
				return true;
			}
			return false;
		}
}
