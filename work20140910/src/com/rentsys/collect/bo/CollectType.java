package com.rentsys.collect.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CollectType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2735739925019916108L;
	private Long collectTypeId;
	private String desc;
	List<CategoryCollect> categoryCollects = new ArrayList<CategoryCollect>();
	public CollectType(){
		
	}
	public Long getCollectTypeId() {
		return collectTypeId;
	}
	public void setCollectTypeId(Long collectTypeId) {
		this.collectTypeId = collectTypeId;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public List<CategoryCollect> getCategoryCollects() {
		return categoryCollects;
	}
	public void setCategoryCollects(List<CategoryCollect> categoryCollects) {
		this.categoryCollects = categoryCollects;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((collectTypeId == null) ? 0 : collectTypeId.hashCode());
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
		CollectType other = (CollectType) obj;
		if (collectTypeId == null) {
			if (other.collectTypeId != null)
				return false;
		} else if (!collectTypeId.equals(other.collectTypeId))
			return false;
		return true;
	}
}
