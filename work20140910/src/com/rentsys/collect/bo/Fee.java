package com.rentsys.collect.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Fee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1027554172375111008L;
	private Long feeId;
	private String feeName;
	private String feeType;//1:collect,2:pay,3:not collect and pay,just store
	private List<ChargeDetail> chargeDetails = new ArrayList<ChargeDetail>();
	private List<RenterFeeRight> renterFeeRights = new ArrayList<RenterFeeRight>();
	
	
	private List<CollectFee> collectFees = new ArrayList<CollectFee>();
	public Fee(){
		
	}
	public Long getFeeId() {
		return feeId;
	}
	public void setFeeId(Long feeId) {
		this.feeId = feeId;
	}
	public String getFeeName() {
		return feeName;
	}
	public void setFeeName(String feeName) {
		this.feeName = feeName;
	}
	public String getFeeType() {
		return feeType;
	}
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((feeId == null) ? 0 : feeId.hashCode());
		result = prime * result + ((feeName == null) ? 0 : feeName.hashCode());
		result = prime * result + ((feeType == null) ? 0 : feeType.hashCode());
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
		Fee other = (Fee) obj;
		if (feeId == null) {
			if (other.feeId != null)
				return false;
		} else if (!feeId.equals(other.feeId))
			return false;
		if (feeName == null) {
			if (other.feeName != null)
				return false;
		} else if (!feeName.equals(other.feeName))
			return false;
		if (feeType == null) {
			if (other.feeType != null)
				return false;
		} else if (!feeType.equals(other.feeType))
			return false;
		return true;
	}
	public List<RenterFeeRight> getRenterFeeRights() {
		return renterFeeRights;
	}
	public void setRenterFeeRights(List<RenterFeeRight> renterFeeRights) {
		this.renterFeeRights = renterFeeRights;
	}
	
	
	public List<CollectFee> getCollectFees() {
		return collectFees;
	}
	public void setCollectFees(List<CollectFee> collectFees) {
		this.collectFees = collectFees;
	}
	public List<ChargeDetail> getChargeDetails() {
		return chargeDetails;
	}
	public void setChargeDetails(List<ChargeDetail> chargeDetails) {
		this.chargeDetails = chargeDetails;
	}
	
	
	
}
