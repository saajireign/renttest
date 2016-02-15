package com.rentsys.collect.bo.address;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Region implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2313187764075499524L;
	private String regionName;
	private Integer regionId;
	private City city;
	private List<Street> streets = new ArrayList<Street>();
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	public Integer getRegionId() {
		return regionId;
	}
	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result
				+ ((regionId == null) ? 0 : regionId.hashCode());
		result = prime * result
				+ ((regionName == null) ? 0 : regionName.hashCode());
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
		Region other = (Region) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (regionId == null) {
			if (other.regionId != null)
				return false;
		} else if (!regionId.equals(other.regionId))
			return false;
		if (regionName == null) {
			if (other.regionName != null)
				return false;
		} else if (!regionName.equals(other.regionName))
			return false;
		return true;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public List<Street> getStreets() {
		return streets;
	}
	public void setStreets(List<Street> streets) {
		this.streets = streets;
	}
}
