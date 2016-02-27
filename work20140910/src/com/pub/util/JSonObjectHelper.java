package com.pub.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public  class JSonObjectHelper {
private  StringBuffer jsonstr=null;
private String quates="'";
private static JSonObjectHelper helper=null;
private JSonObjectHelper(){
	
}
	public static JSonObjectHelper newInstance(){
		if (helper == null) {
			synchronized (JSonObjectHelper.class) {

				if (helper == null) {
					helper = new JSonObjectHelper();
				}

			}
		}
		return helper;
	}
	public StringBuffer getJsonFromObject(Object obj){
		jsonstr=new StringBuffer();
		jsonstr.append("{"+quates+"object"+quates+":{");
		Field[] fields=getFields(obj);
		for(Field field:fields){
			Object value=getter(obj,field.getName());
			if(value!=null){
				jsonstr.append(quates+field.getName()+quates+":"+quates+getter(obj,field.getName())+quates+",");
			}
		}
		jsonstr=new StringBuffer(jsonstr.substring(0,jsonstr.lastIndexOf(",")));
		jsonstr.append("}}");
		return jsonstr;
	}
	public StringBuffer getJsonFromLists(List objlst,String[] expresslst,String mainnode){
		jsonstr=new StringBuffer();
		jsonstr.append("{"+quates+mainnode+quates+":[");
		for(Object obj:objlst){
			jsonstr.append("{");
			for(String express:expresslst){
				jsonstr.append(""+quates+express+quates+":"+quates+getter(obj,express)+quates+",");
			}
			jsonstr=new StringBuffer(jsonstr.substring(0,jsonstr.lastIndexOf(",")));
			jsonstr.append("},");
		}
		jsonstr=new StringBuffer(jsonstr.substring(0,jsonstr.lastIndexOf(",")));
		jsonstr.append("]}");
		return jsonstr;
	}
	public  StringBuffer getJsonFromLists(List objlst){
		jsonstr=new StringBuffer();
		jsonstr.append("{"+quates+"objlst"+quates+":[");
		for(Object objct:objlst){
			jsonstr.append("{");
			Field[] fields=getFields(objct);
			for(int i=0;i<fields.length;i++){
				Object objtByGet=getter(objct,fields[i].getName());
				if(objtByGet!=null){
					if(fields[i].getType().getName().trim().equals("java.lang.Boolean")){
						Integer tempObj=Integer.valueOf(Boolean.valueOf(objtByGet.toString())?1:0);
						jsonstr.append(""+quates+fields[i].getName()+quates+":"+quates+tempObj.toString().trim()+quates+",");
					}else{
						jsonstr.append(""+quates+fields[i].getName()+quates+":"+quates+objtByGet.toString().trim()+quates+",");
					}
				}
			}
			jsonstr=new StringBuffer(jsonstr.substring(0,jsonstr.lastIndexOf(",")));
			jsonstr.append("},");
		}
		jsonstr=new StringBuffer(jsonstr.substring(0,jsonstr.lastIndexOf(",")));
		jsonstr.append("]}");
		return jsonstr;
	}
	public Field[] getFields(Object obj){
		Class<?> object=obj.getClass();
		 Field[] field=object.getDeclaredFields();
		 return field;
	}
	public Object getter(Object obj, String attr) {
		try {
			Method method = obj.getClass().getMethod("get" + initStr(attr));
			return (Object) (method.invoke(obj));
		}catch(NullPointerException e){
			return null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		return null;
	}

	public String initStr(String oldString) {
		String newString = oldString.substring(0, 1).toUpperCase()
				+ oldString.substring(1);
		return newString;
	}
}
