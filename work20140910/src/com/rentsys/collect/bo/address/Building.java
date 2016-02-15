package com.rentsys.collect.bo.address;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Building implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6875148870012103885L;
	private String buildingName;
	private Integer buildingId;
	private Street street;
	private List<Room> rooms = new ArrayList<Room>();
	
	public Street getStreet() {
		return street;
	}
	public void setStreet(Street street) {
		this.street = street;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((buildingId == null) ? 0 : buildingId.hashCode());
		result = prime * result
				+ ((buildingName == null) ? 0 : buildingName.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
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
		Building other = (Building) obj;
		if (buildingId == null) {
			if (other.buildingId != null)
				return false;
		} else if (!buildingId.equals(other.buildingId))
			return false;
		if (buildingName == null) {
			if (other.buildingName != null)
				return false;
		} else if (!buildingName.equals(other.buildingName))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		return true;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public Integer getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(Integer buildingId) {
		this.buildingId = buildingId;
	}
	public List<Room> getRooms() {
		return rooms;
	}
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
}
