package com.rentsys.address.dao;

import java.util.List;

import com.rentsys.collect.bo.address.City;
import com.rentsys.dao.DAO;

public interface CityDao extends DAO{

	List<City> getByCityName(String name);
}
