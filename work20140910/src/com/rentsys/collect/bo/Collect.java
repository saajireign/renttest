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
	private BigDecimal collectFeeSum;//总共收了多少钱
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
	
	private CollectRequest collectRequest;
	
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
	
	
	public CollectRequest getCollectRequest() {
		return collectRequest;
	}
	public void setCollectRequest(CollectRequest collectRequest) {
		this.collectRequest = collectRequest;
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
	public BigDecimal getCollectFeeSum() {
		return collectFeeSum;
	}
	public void setCollectFeeSum(BigDecimal collectFeeSum) {
		this.collectFeeSum = collectFeeSum;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((categoryCollect == null) ? 0 : categoryCollect.hashCode());
		result = prime * result
				+ ((collectDate == null) ? 0 : collectDate.hashCode());
		result = prime * result
				+ ((collectFeeSum == null) ? 0 : collectFeeSum.hashCode());
		result = prime * result
				+ ((collectId == null) ? 0 : collectId.hashCode());
		result = prime * result
				+ ((collectRequest == null) ? 0 : collectRequest.hashCode());
		result = prime * result
				+ ((fromDate == null) ? 0 : fromDate.hashCode());
		result = prime * result + ((toDate == null) ? 0 : toDate.hashCode());
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
		if (categoryCollect == null) {
			if (other.categoryCollect != null)
				return false;
		} else if (!categoryCollect.equals(other.categoryCollect))
			return false;
		if (collectDate == null) {
			if (other.collectDate != null)
				return false;
		} else if (!collectDate.equals(other.collectDate))
			return false;
		if (collectFeeSum == null) {
			if (other.collectFeeSum != null)
				return false;
		} else if (!collectFeeSum.equals(other.collectFeeSum))
			return false;
		if (collectId == null) {
			if (other.collectId != null)
				return false;
		} else if (!collectId.equals(other.collectId))
			return false;
		if (collectRequest == null) {
			if (other.collectRequest != null)
				return false;
		} else if (!collectRequest.equals(other.collectRequest))
			return false;
		if (fromDate == null) {
			if (other.fromDate != null)
				return false;
		} else if (!fromDate.equals(other.fromDate))
			return false;
		if (toDate == null) {
			if (other.toDate != null)
				return false;
		} else if (!toDate.equals(other.toDate))
			return false;
		return true;
	}
	
	

}
