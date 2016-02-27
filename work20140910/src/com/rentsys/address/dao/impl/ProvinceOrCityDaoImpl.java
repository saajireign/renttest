package com.rentsys.address.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.engine.spi.SessionFactoryImplementor;

import com.rentsys.address.dao.ProvinceOrCityDao;
import com.rentsys.collect.bo.address.ProvinceOrCity;
import com.rentsys.dao.impl.BaseDao;

public class ProvinceOrCityDaoImpl extends BaseDao<ProvinceOrCity, Integer> implements
		ProvinceOrCityDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7364149768737551766L;


	public ProvinceOrCityDaoImpl(SessionFactoryImplementor sessionFactory) {
		super(sessionFactory);
		// TODO Auto-generated constructor stub
	}


	@Override
	public List<ProvinceOrCity> getByProvinceName(String name) {
		// TODO Auto-generated method stub
		
		ProvinceOrCity province = new ProvinceOrCity();
		province.setProvinceName(name);
		return getByExampleLike(province);
	}

}
