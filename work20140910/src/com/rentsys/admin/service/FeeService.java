package com.rentsys.admin.service;

import java.util.List;

import com.rentsys.collect.bo.Fee;

public interface FeeService {
	List<Fee> getAll();
	Boolean saveFee(Fee fee);
	List<Fee> getByExampleLike(Fee fee);
	List<Fee> getByExampleEq(Fee fee);
}
