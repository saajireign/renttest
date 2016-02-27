package com.rentsys.address.dao;

import java.util.List;

import com.rentsys.collect.bo.address.ProvinceOrCity;
import com.rentsys.dao.DAO;

public interface ProvinceOrCityDao extends DAO{
	List<ProvinceOrCity> getByProvinceName(String name);
	
}
