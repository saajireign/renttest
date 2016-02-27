package com.rentsys.address.service;

import java.util.List;

import com.rentsys.collect.bo.address.ProvinceOrCity;
import com.rentsys.collect.bo.address.Region;
import com.rentsys.collect.bo.address.Room;
import com.rentsys.collect.bo.address.Street;

public interface ProvinceService extends AddressService<ProvinceOrCity> {
	List<Region> getRegionsByProvince(ProvinceOrCity province);
	List<Street> getStreetsByProvince(ProvinceOrCity province);
	List<Room> getRoomsByProvince(ProvinceOrCity province);
}
