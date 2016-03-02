package com.rentsys.admin.service;

import java.util.List;

import com.rentsys.collect.bo.Appointment;
import com.rentsys.collect.bo.RoomUnit;
import com.rentsys.collect.bo.address.Room;

public interface RoomUnitService {
	List<Appointment> getAppointmentsByRoomUnit(RoomUnit roomUnit);

}
