package com.rentsys.address.dao;

import java.util.List;

import com.rentsys.collect.bo.address.Building;
import com.rentsys.collect.bo.address.City;
import com.rentsys.collect.bo.address.ProvinceOrCity;
import com.rentsys.collect.bo.address.Region;

public interface BuildingDao {
	List<Building> getByBuildingName(String name);
	List<Building> getByRegion(Region region);
	List<Building> getByCity(City city);
	List<Building> getByProvince(ProvinceOrCity province);
}
