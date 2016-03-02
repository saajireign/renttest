package com.rentsys.admin.dao;

import java.util.List;

import com.rentsys.collect.bo.Person;
import com.rentsys.collect.bo.RentingPeople;
import com.rentsys.collect.bo.RoomUnit;
import com.rentsys.collect.bo.address.Room;
import com.rentsys.dao.DAO;

public interface RentingPeopleDao extends DAO {
	List<RentingPeople> getValidRentingPeopleOfRoom(Room room);
	List<RentingPeople> getValidRentingPeopleByRoomUnit(RoomUnit roomUnit);
	Boolean saveAsRentingPeople(Person person);
	List<RentingPeople> getRentingPeopleNotRented();
	List<RentingPeople> getRentingPeopleNotRentedByName(String name);
}
