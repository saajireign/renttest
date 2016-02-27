package com.rentsys.address.dao;

import java.util.List;

import com.rentsys.collect.bo.address.ProvinceOrCity;
import com.rentsys.collect.bo.address.Room;
import com.rentsys.dao.DAO;

public interface RoomDao extends DAO{
	List<Room> getByProvince(ProvinceOrCity province);
}
