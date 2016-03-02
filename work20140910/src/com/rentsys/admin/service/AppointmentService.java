package com.rentsys.admin.service;

import java.util.List;

import com.rentsys.collect.bo.Appointment;
import com.rentsys.collect.bo.Fee;
import com.rentsys.collect.bo.address.Room;

public interface AppointmentService {
	List<Appointment> getAppointmentsByFeeAndRoom(Fee fee,Room room);
	Boolean saveAppointment(Appointment appointment);
}
