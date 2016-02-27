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
	private CollectFee collectFee;
	private BigDecimal renterFeeAmount;//这次收费总量值
	private BigDecimal renterFeeSum;//这次收费收了多少钱
	private String renterFeeStatus;
	public CollectRenterFee(){
		
	}
	public Renter getRenter() {
		return renter;
	}
	public void setRenter(Renter renter) {
		this.renter = renter;
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
	
	public CollectFee getCollectFee() {
		return collectFee;
	}
	public void setCollectFee(CollectFee collectFee) {
		this.collectFee = collectFee;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((collectFee == null) ? 0 : collectFee.hashCode());
		result = prime * result
				+ ((recordId == null) ? 0 : recordId.hashCode());
		result = prime * result + ((renter == null) ? 0 : renter.hashCode());
		result = prime * result
				+ ((renterFeeAmount == null) ? 0 : renterFeeAmount.hashCode());
		result = prime * result
				+ ((renterFeeStatus == null) ? 0 : renterFeeStatus.hashCode());
		result = prime * result
				+ ((renterFeeSum == null) ? 0 : renterFeeSum.hashCode());
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
		if (collectFee == null) {
			if (other.collectFee != null)
				return false;
		} else if (!collectFee.equals(other.collectFee))
			return false;
		if (recordId == null) {
			if (other.recordId != null)
				return false;
		} else if (!recordId.equals(other.recordId))
			return false;
		if (renter == null) {
			if (other.renter != null)
				return false;
		} else if (!renter.equals(other.renter))
			return false;
		if (renterFeeAmount == null) {
			if (other.renterFeeAmount != null)
				return false;
		} else if (!renterFeeAmount.equals(other.renterFeeAmount))
			return false;
		if (renterFeeStatus == null) {
			if (other.renterFeeStatus != null)
				return false;
		} else if (!renterFeeStatus.equals(other.renterFeeStatus))
			return false;
		if (renterFeeSum == null) {
			if (other.renterFeeSum != null)
				return false;
		} else if (!renterFeeSum.equals(other.renterFeeSum))
			return false;
		return true;
	}
	public BigDecimal getRenterFeeSum() {
		return renterFeeSum;
	}
	public void setRenterFeeSum(BigDecimal renterFeeSum) {
		this.renterFeeSum = renterFeeSum;
	}
	
}
