package com.rentsys.collect.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CategoryCollect implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7016146309484595267L;
	private Long categoryCollectId;
	private CollectType collectType;
	private List<Collect> collects;
	private String collectTemplateName;
	public CategoryCollect(){
		
	}
	public Long getCategoryCollectId() {
		return categoryCollectId;
	}
	public void setCategoryCollectId(Long categoryCollectId) {
		this.categoryCollectId = categoryCollectId;
	}
	public CollectType getCollectType() {
		return collectType;
	}
	public void setCollectType(CollectType collectType) {
		this.collectType = collectType;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((categoryCollectId == null) ? 0 : categoryCollectId
						.hashCode());
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
		CategoryCollect other = (CategoryCollect) obj;
		if (categoryCollectId == null) {
			if (other.categoryCollectId != null)
				return false;
		} else if (!categoryCollectId.equals(other.categoryCollectId))
			return false;
		return true;
	}
	public String getCollectTemplateName() {
		return collectTemplateName;
	}
	public void setCollectTemplateName(String collectTemplateName) {
		this.collectTemplateName = collectTemplateName;
	}
	public List<Collect> getCollects() {
		return collects;
	}
	public void setCollects(List<Collect> collects) {
		this.collects = collects;
	}
	
	
}
