package com.rentsys.admin.service;

import java.util.List;

import com.rentsys.collect.bo.Appointment;
import com.rentsys.collect.bo.Person;

public interface PersonService {
	Boolean saveAsRentingPeople(Person person);
	List<Appointment> getAppointmentInfoByPerson(Person person);
	List<Person> listAll();
	List<Person> findByLike(Person person);
	List<Person> findByCardTypeAndId(String cardType,String cardId);
}
