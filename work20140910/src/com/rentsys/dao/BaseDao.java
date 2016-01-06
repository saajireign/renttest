package com.rentsys.dao;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.springframework.orm.ObjectRetrievalFailureException;
import org.springframework.orm.hibernate4.SpringSessionContext;
import org.hibernate.Criteria;

import com.pub.util.ReflectHelper;




public class BaseDao<T extends Serializable,PK extends Serializable> extends SpringSessionContext implements DAO{
	
	protected Class<T> entityClass = ReflectHelper.getSuperClassGenricType(getClass());
	public BaseDao(SessionFactoryImplementor sessionFactory) {
		super(sessionFactory);
		// TODO Auto-generated constructor stub
	}
	protected ReflectHelper helper;
	public ReflectHelper getHelper() {
		return helper;
	}


	public void setHelper(ReflectHelper helper) {
		this.helper = helper;
	}


	public Object getObject( Serializable id) {
		// TODO Auto-generated method stub
	Object o= getHibernateTemplate().get(entityClass, id);
	if(o==null){
		throw new ObjectRetrievalFailureException(entityClass,id);
	}
	return o;
	}


	protected Session getHibernateTemplate() {
		// TODO Auto-generated method stub
		return currentSession();
	}


	public List<T> getObjectList() {
		// TODO Auto-generated method stub

		return getHibernateTemplate().createQuery("from "+entityClass.getName()).list();
	}

	public void saveObject(Object obj) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(obj);
	}

	public void deleteObject(Serializable id) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(getObject( id));
	}
	public List<T> getObjectListByExample(Object example){
		Map<String,Object> objmap=helper.getMapFromObj(example);
		return getHibernateTemplate().createCriteria(example.getClass()).add(Restrictions.allEq(objmap)).list();
	}


	public void saveOrUpdateObject(Object obj) {
		// TODO Auto-generated method stub
		getHibernateTemplate().saveOrUpdate(obj);
	}


	public List<T> getByExampleLike(Object example) {
		// TODO Auto-generated method stub
		Map<String,Object> objmap=helper.getMapFromObj(example);
		Criteria criteria=getHibernateTemplate().createCriteria(example.getClass());
		   Set<Entry<String, Object>> entries=objmap.entrySet();
		   if(entries!=null)
		   {
			   Iterator<Entry<String, Object>> it=entries.iterator();
			   while(it.hasNext())
			   {
				   Map.Entry<String,Object> entry=(Entry<String, Object>) it.next();
				   if(entry.getKey()!=null&&entry.getValue()!=null)
				   {
					   if(!entry.getValue().toString().trim().equals("")){
						   criteria.add(Restrictions.ilike(entry.getKey(),(String)entry.getValue(),MatchMode.ANYWHERE));
					   }
				   }
			   }
		   }
		return criteria.list(); 
	}

}
