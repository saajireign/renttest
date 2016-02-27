package com.rentsys.admin.dao;

import java.util.List;

import com.rentsys.collect.bo.Renter;
import com.rentsys.collect.bo.RoomUnit;
import com.rentsys.collect.bo.address.Room;
import com.rentsys.dao.DAO;

public interface RenterDao extends DAO{
	List<Renter> getValidRenterOfRoom(Room room);
	List<Renter> getValidRenterByRoomUnit(RoomUnit roomUnit);
	
}
