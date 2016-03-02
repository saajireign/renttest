package com.rentsys.admin.dao;

import java.util.List;

import com.rentsys.collect.bo.Person;
import com.rentsys.collect.bo.RoomUnit;
import com.rentsys.dao.DAO;

public interface RoomUnitDao extends DAO {
	List<RoomUnit> getRoomUnitByPerson(Person person);
}
