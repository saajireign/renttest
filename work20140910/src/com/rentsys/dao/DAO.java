package com.rentsys.dao;

import java.io.Serializable;
import java.util.List;

public interface DAO{
public Object getObject(Serializable id);
public List getObjectList();
public void saveObject(Object obj);
public void deleteObject(Serializable id);
public List getObjectListByExample(Object example);
public void saveOrUpdateObject(Object obj);
public List getByExampleLike(Object example);
}
