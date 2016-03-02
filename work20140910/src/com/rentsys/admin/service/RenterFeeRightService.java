package com.rentsys.admin.service;

import java.util.List;

import com.rentsys.collect.bo.Appointment;
import com.rentsys.collect.bo.Fee;
import com.rentsys.collect.bo.RenterFeeRight;


public interface RenterFeeRightService {
	List<RenterFeeRight> getFeeRightByAppointmentAndFee(Appointment appointment,Fee fee);
	Boolean saveRenterFeeRight(RenterFeeRight feeRight);
}
