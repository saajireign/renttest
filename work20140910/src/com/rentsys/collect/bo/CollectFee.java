package com.rentsys.collect.bo;

import java.io.Serializable;
import java.sql.Date;

public class CollectFee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2014128441683968552L;
	private Collect collect;
	private Long listId;
	private Fee fee;
	private Long categoryCollectId;
	private Long chargeId;
	private Date collectDate;
	public Collect getCollect() {
		return collect;
	}
	public void setCollect(Collect collect) {
		this.collect = collect;
	}

	public Fee getFee() {
		return fee;
	}
	public void setFee(Fee fee) {
		this.fee = fee;
	}

	public Date getCollectDate() {
		return collectDate;
	}
	public void setCollectDate(Date collectDate) {
		this.collectDate = collectDate;
	}
	public Long getListId() {
		return listId;
	}
	public void setListId(Long listId) {
		this.listId = listId;
	}
	public Long getChargeId() {
		return chargeId;
	}
	public void setChargeId(Long chargeId) {
		this.chargeId = chargeId;
	}
	public Long getCategoryCollectId() {
		return categoryCollectId;
	}
	public void setCategoryCollectId(Long categoryCollectId) {
		this.categoryCollectId = categoryCollectId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((categoryCollectId == null) ? 0 : categoryCollectId
						.hashCode());
		result = prime * result
				+ ((chargeId == null) ? 0 : chargeId.hashCode());
		result = prime * result + ((collect == null) ? 0 : collect.hashCode());
		result = prime * result
				+ ((collectDate == null) ? 0 : collectDate.hashCode());
		result = prime * result + ((fee == null) ? 0 : fee.hashCode());
		result = prime * result + ((listId == null) ? 0 : listId.hashCode());
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
		CollectFee other = (CollectFee) obj;
		if (categoryCollectId == null) {
			if (other.categoryCollectId != null)
				return false;
		} else if (!categoryCollectId.equals(other.categoryCollectId))
			return false;
		if (chargeId == null) {
			if (other.chargeId != null)
				return false;
		} else if (!chargeId.equals(other.chargeId))
			return false;
		if (collect == null) {
			if (other.collect != null)
				return false;
		} else if (!collect.equals(other.collect))
			return false;
		if (collectDate == null) {
			if (other.collectDate != null)
				return false;
		} else if (!collectDate.equals(other.collectDate))
			return false;
		if (fee == null) {
			if (other.fee != null)
				return false;
		} else if (!fee.equals(other.fee))
			return false;
		if (listId == null) {
			if (other.listId != null)
				return false;
		} else if (!listId.equals(other.listId))
			return false;
		return true;
	}

	
	
}
