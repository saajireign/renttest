package com.rentsys.collect.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

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
	private Long priceId;
	private Date collectDate;
	private BigDecimal collectFeeAmount;//这种类型的收费总量值
	private BigDecimal collectFeeSum;//这种类型的收费总值
	private String collectFeeStatus;
	private List<CollectRenterFee> collectRenterFees = new ArrayList<CollectRenterFee>();
	private List<CollectRoomFee> collectRoomFees = new ArrayList<CollectRoomFee>();
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
	
	public BigDecimal getCollectFeeAmount() {
		return collectFeeAmount;
	}
	public void setCollectFeeAmount(BigDecimal collectFeeAmount) {
		this.collectFeeAmount = collectFeeAmount;
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
	public BigDecimal getCollectFeeSum() {
		return collectFeeSum;
	}
	public void setCollectFeeSum(BigDecimal collectFeeSum) {
		this.collectFeeSum = collectFeeSum;
	}
	
	
	public String getCollectFeeStatus() {
		return collectFeeStatus;
	}
	public void setCollectFeeStatus(String collectFeeStatus) {
		this.collectFeeStatus = collectFeeStatus;
	}
	public Long getPriceId() {
		return priceId;
	}
	public void setPriceId(Long priceId) {
		this.priceId = priceId;
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
		result = prime
				* result
				+ ((collectFeeAmount == null) ? 0 : collectFeeAmount.hashCode());
		result = prime
				* result
				+ ((collectFeeStatus == null) ? 0 : collectFeeStatus.hashCode());
		result = prime * result
				+ ((collectFeeSum == null) ? 0 : collectFeeSum.hashCode());
		result = prime * result + ((fee == null) ? 0 : fee.hashCode());
		result = prime * result + ((listId == null) ? 0 : listId.hashCode());
		result = prime * result + ((priceId == null) ? 0 : priceId.hashCode());
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
		if (collectFeeAmount == null) {
			if (other.collectFeeAmount != null)
				return false;
		} else if (!collectFeeAmount.equals(other.collectFeeAmount))
			return false;
		if (collectFeeStatus == null) {
			if (other.collectFeeStatus != null)
				return false;
		} else if (!collectFeeStatus.equals(other.collectFeeStatus))
			return false;
		if (collectFeeSum == null) {
			if (other.collectFeeSum != null)
				return false;
		} else if (!collectFeeSum.equals(other.collectFeeSum))
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
		if (priceId == null) {
			if (other.priceId != null)
				return false;
		} else if (!priceId.equals(other.priceId))
			return false;
		return true;
	}

	
	
}
