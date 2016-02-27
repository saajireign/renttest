package com.rentsys.admin.dao;

import java.util.List;

import com.rentsys.collect.bo.Equipment;
import com.rentsys.collect.bo.RoomUnit;
import com.rentsys.collect.bo.address.Room;
import com.rentsys.dao.DAO;

public interface EquipmentDao extends DAO{
	List<Equipment> getValidRenterOfRoom(Room room);
	List<Equipment> getValidRenterByRoomUnit(RoomUnit roomUnit);
}
