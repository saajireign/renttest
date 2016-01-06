package com.rentsys.collect.bo;

import java.io.Serializable;
import java.math.BigDecimal;

public class CollectRenterFee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3363103318416960401L;
	private Long recordId;
	private Renter renter;
	private Collect collect;
	private BigDecimal renterFeeAmount;
	private String renterFeeStatus;
	public CollectRenterFee(){
		
	}
	public Renter getRenter() {
		return renter;
	}
	public void setRenter(Renter renter) {
		this.renter = renter;
	}
	public Collect getCollect() {
		return collect;
	}
	public void setCollect(Collect collect) {
		this.collect = collect;
	}
	public BigDecimal getRenterFeeAmount() {
		return renterFeeAmount;
	}
	public void setRenterFeeAmount(BigDecimal renterFeeAmount) {
		this.renterFeeAmount = renterFeeAmount;
	}
	public String getRenterFeeStatus() {
		return renterFeeStatus;
	}
	public void setRenterFeeStatus(String renterFeeStatus) {
		this.renterFeeStatus = renterFeeStatus;
	}
	public Long getRecordId() {
		return recordId;
	}
	public void setRecordId(Long recordId) {
		this.recordId = recordId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((recordId == null) ? 0 : recordId.hashCode());
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
		CollectRenterFee other = (CollectRenterFee) obj;
		if (recordId == null) {
			if (other.recordId != null)
				return false;
		} else if (!recordId.equals(other.recordId))
			return false;
		return true;
	}
}
