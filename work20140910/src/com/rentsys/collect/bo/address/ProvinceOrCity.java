package com.rentsys.collect.bo.address;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProvinceOrCity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8413692092540332928L;
	private String provinceName;
	private Integer provinceId;
	private List<City> cities = new ArrayList<City>();
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	
	public Integer getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((provinceId == null) ? 0 : provinceId.hashCode());
		result = prime * result
				+ ((provinceName == null) ? 0 : provinceName.hashCode());
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
		ProvinceOrCity other = (ProvinceOrCity) obj;
		if (provinceId == null) {
			if (other.provinceId != null)
				return false;
		} else if (!provinceId.equals(other.provinceId))
			return false;
		if (provinceName == null) {
			if (other.provinceName != null)
				return false;
		} else if (!provinceName.equals(other.provinceName))
			return false;
		return true;
	}
	public List<City> getCities() {
		return cities;
	}
	public void setCities(List<City> cities) {
		this.cities = cities;
	}
}
