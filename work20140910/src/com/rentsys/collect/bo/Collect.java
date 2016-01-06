package com.rentsys.collect.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Collect implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5848559535281821530L;
	private Long collectId;
	private Date collectDate;
	private Date fromDate;
	private Date toDate;
	private List<FeePrice> feePrices;
	private CategoryCollect categoryCollect;
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	private BigDecimal collectFeeAmount;//这种类型的收费需要收多少钱
	private CollectRequest collectRequest;
	private List<CollectRenterFee> collectRenterFees = new ArrayList<CollectRenterFee>();
	private List<CollectRoomFee> collectRoomFees = new ArrayList<CollectRoomFee>();
	private List<CollectFee> collectFees = new ArrayList<CollectFee>();
	public Collect(){
		
	}
	public Long getCollectId() {
		return collectId;
	}
	public void setCollectId(Long collectId) {
		this.collectId = collectId;
	}
	public Date getCollectDate() {
		return collectDate;
	}
	public void setCollectDate(Date collectDate) {
		this.collectDate = collectDate;
	}
	
	public BigDecimal getCollectFeeAmount() {
		return collectFeeAmount;
	}
	public void setCollectFeeAmount(BigDecimal collectFeeAmount) {
		this.collectFeeAmount = collectFeeAmount;
	}
	public CollectRequest getCollectRequest() {
		return collectRequest;
	}
	public void setCollectRequest(CollectRequest collectRequest) {
		this.collectRequest = collectRequest;
	}
	public List<CollectRenterFee> getCollectRenterFees() {
		return collectRenterFees;
	}
	public void setCollectRenterFees(List<CollectRenterFee> collectRenterFees) {
		this.collectRenterFees = collectRenterFees;
	}
	public List<CollectRoomFee> getCollectRoomFees() {
		return collectRoomFees;
	}
	public void setCollectRoomFees(List<CollectRoomFee> collectRoomFees) {
		this.collectRoomFees = collectRoomFees;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((collectDate == null) ? 0 : collectDate.hashCode());
		result = prime
				* result
				+ ((collectFeeAmount == null) ? 0 : collectFeeAmount.hashCode());
		result = prime * result
				+ ((collectId == null) ? 0 : collectId.hashCode());
		result = prime
				* result
				+ ((collectRenterFees == null) ? 0 : collectRenterFees
						.hashCode());
		result = prime * result
				+ ((collectRequest == null) ? 0 : collectRequest.hashCode());
		result = prime * result
				+ ((collectRoomFees == null) ? 0 : collectRoomFees.hashCode());
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
		Collect other = (Collect) obj;
		if (collectDate == null) {
			if (other.collectDate != null)
				return false;
		} else if (!collectDate.equals(other.collectDate))
			return false;
		if (collectFeeAmount == null) {
			if (other.collectFeeAmount != null)
				return false;
		} else if (!collectFeeAmount.equals(other.collectFeeAmount))
			return false;
		if (collectId == null) {
			if (other.collectId != null)
				return false;
		} else if (!collectId.equals(other.collectId))
			return false;
		if (collectRenterFees == null) {
			if (other.collectRenterFees != null)
				return false;
		} else if (!collectRenterFees.equals(other.collectRenterFees))
			return false;
		if (collectRequest == null) {
			if (other.collectRequest != null)
				return false;
		} else if (!collectRequest.equals(other.collectRequest))
			return false;
		if (collectRoomFees == null) {
			if (other.collectRoomFees != null)
				return false;
		} else if (!collectRoomFees.equals(other.collectRoomFees))
			return false;
		return true;
	}
	public List<CollectFee> getCollectFees() {
		return collectFees;
	}
	public void setCollectFees(List<CollectFee> collectFees) {
		this.collectFees = collectFees;
	}
	public List<FeePrice> getFeePrices() {
		return feePrices;
	}
	public void setFeePrices(List<FeePrice> feePrices) {
		this.feePrices = feePrices;
	}
	public CategoryCollect getCategoryCollect() {
		return categoryCollect;
	}
	public void setCategoryCollect(CategoryCollect categoryCollect) {
		this.categoryCollect = categoryCollect;
	}
	
	

}
