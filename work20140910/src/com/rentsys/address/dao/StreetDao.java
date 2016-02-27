package com.rentsys.address.dao;

import java.util.List;

import com.rentsys.collect.bo.address.City;
import com.rentsys.collect.bo.address.ProvinceOrCity;
import com.rentsys.collect.bo.address.Street;
import com.rentsys.dao.DAO;

public interface StreetDao extends DAO{
	List<Street> getByStreetName(String name);
	List<Street> getByCity(City city);
	List<Street> getByProvince(ProvinceOrCity province);
}
