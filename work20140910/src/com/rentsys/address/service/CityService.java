package com.rentsys.address.service;

import java.util.List;

import com.rentsys.collect.bo.CollectRequest;
import com.rentsys.collect.bo.address.City;
import com.rentsys.collect.bo.address.Room;
import com.rentsys.collect.bo.address.Street;

public interface CityService extends AddressService<City> {
	
	List<Street> getStreetsByCity(City city);
	List<Room> getRoomsByCity(City city);
	List<CollectRequest> getRoomFeeDetailsInCity(City city);
}
