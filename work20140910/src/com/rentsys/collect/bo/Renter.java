package com.rentsys.collect.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Renter implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6076101382767446141L;
	private Integer renterId;
	private String renterDesc;
	private String renterName;
	private String renterType;//1:equip,2:people
	private String renterStatus;//1:renting,2:not renting
	private Set<Appointment> appointments = new HashSet<Appointment>();
	
	private List<CollectRenterFee> collectRenterFees = new ArrayList<CollectRenterFee>();
	public Renter(){
		
	}
	public Integer getRenterId() {
		return renterId;
	}
	public void setRenterId(Integer renterId) {
		this.renterId = renterId;
	}
	public String getRenterDesc() {
		return renterDesc;
	}
	public void setRenterDesc(String renterDesc) {
		this.renterDesc = renterDesc;
	}
	public String getRenterName() {
		return renterName;
	}
	public void setRenterName(String renterName) {
		this.renterName = renterName;
	}
	public String getRenterType() {
		return renterType;
	}
	public void setRenterType(String renterType) {
		this.renterType = renterType;
	}
	public Set<Appointment> getAppointments() {
		return appointments;
	}
	public void setAppointments(Set<Appointment> appointments) {
		this.appointments = appointments;
	}
	
	public List<CollectRenterFee> getCollectRenterFees() {
		return collectRenterFees;
	}
	public void setCollectRenterFees(List<CollectRenterFee> collectRenterFees) {
		this.collectRenterFees = collectRenterFees;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((renterId == null) ? 0 : renterId.hashCode());
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
		Renter other = (Renter) obj;
		if (renterId == null) {
			if (other.renterId != null)
				return false;
		} else if (!renterId.equals(other.renterId))
			return false;
		return true;
	}
	public String getRenterStatus() {
		return renterStatus;
	}
	public void setRenterStatus(String renterStatus) {
		this.renterStatus = renterStatus;
	}
}
