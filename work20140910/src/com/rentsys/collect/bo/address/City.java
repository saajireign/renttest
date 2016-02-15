package com.rentsys.collect.bo.address;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class City implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2840984197950901700L;
	private String cityName;
	private Integer cityId;
	private ProvinceOrCity provinceOrCity;
	private List<Region> regions = new ArrayList<Region>();
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cityId == null) ? 0 : cityId.hashCode());
		result = prime * result
				+ ((cityName == null) ? 0 : cityName.hashCode());
		result = prime * result
				+ ((provinceOrCity == null) ? 0 : provinceOrCity.hashCode());
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
		City other = (City) obj;
		if (cityId == null) {
			if (other.cityId != null)
				return false;
		} else if (!cityId.equals(other.cityId))
			return false;
		if (cityName == null) {
			if (other.cityName != null)
				return false;
		} else if (!cityName.equals(other.cityName))
			return false;
		if (provinceOrCity == null) {
			if (other.provinceOrCity != null)
				return false;
		} else if (!provinceOrCity.equals(other.provinceOrCity))
			return false;
		return true;
	}
	public ProvinceOrCity getProvinceOrCity() {
		return provinceOrCity;
	}
	public void setProvinceOrCity(ProvinceOrCity provinceOrCity) {
		this.provinceOrCity = provinceOrCity;
	}
	public List<Region> getRegions() {
		return regions;
	}
	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

}
