package com.rentsys.address.service;

import java.util.List;

import com.rentsys.collect.bo.address.Building;
import com.rentsys.collect.bo.address.Room;

public interface RoomService extends AddressService<Room> {
	List<Room> getByBuildingAndName(Building building,String name);
}
