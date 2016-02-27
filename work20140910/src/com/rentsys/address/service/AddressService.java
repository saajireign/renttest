package com.rentsys.address.service;

import java.util.List;

public interface AddressService<T> {
	List<T> getByName(String name);
	Boolean addAddress(T address);
	List<T> getAll();
}
