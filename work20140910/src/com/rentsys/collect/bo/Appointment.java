package com.rentsys.collect.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Appointment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2482474902170171150L;
	private Integer appointmentId;
	private RoomUnit roomUnit;
	private Renter renter;//这个renter包含了rentingpeople和equipment
	private Date appointmentStartDate;
	private Date appointmentEndDate;
	private String appointmentDesc;
	private BigDecimal appointmentGuarenteeMoney;//押金，保障金
	private List<RenterFeeRight> renterFeeRights = new ArrayList<RenterFeeRight>();
	//TODO 还有feeright字段 权重，是一个集合，权重分到合同里
	public Integer getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(Integer appointmentId) {
		this.appointmentId = appointmentId;
	}
	public RoomUnit getRoomUnit() {
		return roomUnit;
	}
	public void setRoomUnit(RoomUnit roomUnit) {
		this.roomUnit = roomUnit;
	}
	public Renter getRenter() {
		return renter;
	}
	public void setRenter(Renter renter) {
		this.renter = renter;
	}
	public Date getAppointmentStartDate() {
		return appointmentStartDate;
	}
	public void setAppointmentStartDate(Date appointmentStartDate) {
		this.appointmentStartDate = appointmentStartDate;
	}
	public Date getAppointmentEndDate() {
		return appointmentEndDate;
	}
	public void setAppointmentEndDate(Date appointmentEndDate) {
		this.appointmentEndDate = appointmentEndDate;
	}
	public String getAppointmentDesc() {
		return appointmentDesc;
	}
	public void setAppointmentDesc(String appointmentDesc) {
		this.appointmentDesc = appointmentDesc;
	}
	public BigDecimal getAppointmentGuarenteeMoney() {
		return appointmentGuarenteeMoney;
	}
	public void setAppointmentGuarenteeMoney(BigDecimal appointmentGuarenteeMoney) {
		this.appointmentGuarenteeMoney = appointmentGuarenteeMoney;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((appointmentId == null) ? 0 : appointmentId.hashCode());
		result = prime * result + ((renter == null) ? 0 : renter.hashCode());
		result = prime * result
				+ ((roomUnit == null) ? 0 : roomUnit.hashCode());
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
		Appointment other = (Appointment) obj;
		if (appointmentId == null) {
			if (other.appointmentId != null)
				return false;
		} else if (!appointmentId.equals(other.appointmentId))
			return false;
		if (renter == null) {
			if (other.renter != null)
				return false;
		} else if (!renter.equals(other.renter))
			return false;
		if (roomUnit == null) {
			if (other.roomUnit != null)
				return false;
		} else if (!roomUnit.equals(other.roomUnit))
			return false;
		return true;
	}
	public List<RenterFeeRight> getRenterFeeRights() {
		return renterFeeRights;
	}
	public void setRenterFeeRights(List<RenterFeeRight> renterFeeRights) {
		this.renterFeeRights = renterFeeRights;
	}
}
