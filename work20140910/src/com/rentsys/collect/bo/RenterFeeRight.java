package com.rentsys.collect.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

public class RenterFeeRight implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7184363020558880150L;
	private Fee fee;
	private Appointment appointment;
	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	private BigDecimal rightValue;
	private Date startDate;
	private Date endDate;
	public RenterFeeRight(){
		
	}
	
	public Fee getFee() {
		return fee;
	}
	public void setFee(Fee fee) {
		this.fee = fee;
	}
	

	public BigDecimal getRightValue() {
		return rightValue;
	}

	public void setRightValue(BigDecimal rightValue) {
		this.rightValue = rightValue;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	

	

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((appointment == null) ? 0 : appointment.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((fee == null) ? 0 : fee.hashCode());
		
		result = prime * result
				+ ((rightValue == null) ? 0 : rightValue.hashCode());
		result = prime * result
				+ ((startDate == null) ? 0 : startDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RenterFeeRight other = (RenterFeeRight) obj;
		if (appointment == null) {
			if (other.appointment != null)
				return false;
		} else if (!appointment.equals(other.appointment))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (fee == null) {
			if (other.fee != null)
				return false;
		} else if (!fee.equals(other.fee))
			return false;
		if (rightValue == null) {
			if (other.rightValue != null)
				return false;
		} else if (!rightValue.equals(other.rightValue))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}



	
}
