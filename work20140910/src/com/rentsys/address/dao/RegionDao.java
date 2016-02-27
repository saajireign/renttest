package com.rentsys.address.dao;

import java.util.List;

import com.rentsys.collect.bo.address.ProvinceOrCity;
import com.rentsys.collect.bo.address.Region;
import com.rentsys.dao.DAO;

public interface RegionDao extends DAO{
	List<Region> getByRegionName(String name);
	List<Region> getByProvince(ProvinceOrCity province);
}
