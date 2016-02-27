package com.rentsys.admin.dao;

import java.util.List;

import com.rentsys.collect.bo.Appointment;
import com.rentsys.collect.bo.address.Room;
import com.rentsys.dao.DAO;

public interface AppointmentDao extends DAO {
	List<Appointment> getAppointmentsByRoom(Room room);
}
