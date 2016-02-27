package com.rentsys.admin.service;

import java.util.List;

import com.rentsys.collect.bo.Appointment;
import com.rentsys.collect.bo.Fee;
import com.rentsys.collect.bo.Renter;
import com.rentsys.collect.bo.RenterFeeRight;
import com.rentsys.collect.bo.RoomUnit;
import com.rentsys.collect.bo.address.Room;

public interface RenterService {
	Boolean addRentingPeople(Renter renter);
	Boolean addEquipment(Renter renter);
	List<Renter> getAllValidRentersByRoom(Room room);
	List<Renter> getAllValidRentingPeopleByRoom(Room room);
	List<Renter> getAllValidEquipmentByRoom(Room room);
	List<Renter> getAllValidRentersByRoomUnit(RoomUnit roomUnit);
	List<Renter> getAllValidRentingPeopleByRoomUnit(RoomUnit roomUnit);
	List<Renter> getAllValidEquipmentByRoomUnit(RoomUnit roomUnit);
	List<RenterFeeRight> getRenterFeeRightsByRenter(Renter renter);
	List<RenterFeeRight> getRenterFeeRightByRenterAndFee(Renter renter,Fee fee);
	List<Renter> getRentingPeopleThroughAppointment(Appointment appointment);
}
