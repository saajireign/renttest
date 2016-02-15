package com.rentsys.collect.bo.address;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Street implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8596717136180970479L;
	private String streetName;
	private Integer streetId;
	private Region region;
	private List<Building> buildings = new ArrayList<Building>();
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public Integer getStreetId() {
		return streetId;
	}
	public void setStreetId(Integer streetId) {
		this.streetId = streetId;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result
				+ ((streetId == null) ? 0 : streetId.hashCode());
		result = prime * result
				+ ((streetName == null) ? 0 : streetName.hashCode());
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
		Street other = (Street) obj;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		if (streetId == null) {
			if (other.streetId != null)
				return false;
		} else if (!streetId.equals(other.streetId))
			return false;
		if (streetName == null) {
			if (other.streetName != null)
				return false;
		} else if (!streetName.equals(other.streetName))
			return false;
		return true;
	}
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	public List<Building> getBuildings() {
		return buildings;
	}
	public void setBuildings(List<Building> buildings) {
		this.buildings = buildings;
	}
}
