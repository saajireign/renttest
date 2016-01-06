package com.rentsys.collect.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

public class FeePrice implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5618833204095162472L;
	private Fee fee;
	private Long priceId;
	private Date priceDate;
	private BigDecimal price;
	private String priceUnit;
	private Collect collect;
	public FeePrice(){
		
	}
	public Fee getFee() {
		return fee;
	}
	public void setFee(Fee fee) {
		this.fee = fee;
	}
	public Date getPriceDate() {
		return priceDate;
	}
	public void setPriceDate(Date priceDate) {
		this.priceDate = priceDate;
	}
	public Long getPriceId() {
		return priceId;
	}
	public void setPriceId(Long priceId) {
		this.priceId = priceId;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fee == null) ? 0 : fee.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result
				+ ((priceDate == null) ? 0 : priceDate.hashCode());
		result = prime * result + ((priceId == null) ? 0 : priceId.hashCode());
		result = prime * result
				+ ((priceUnit == null) ? 0 : priceUnit.hashCode());
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
		FeePrice other = (FeePrice) obj;
		if (fee == null) {
			if (other.fee != null)
				return false;
		} else if (!fee.equals(other.fee))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (priceDate == null) {
			if (other.priceDate != null)
				return false;
		} else if (!priceDate.equals(other.priceDate))
			return false;
		if (priceId == null) {
			if (other.priceId != null)
				return false;
		} else if (!priceId.equals(other.priceId))
			return false;
		if (priceUnit == null) {
			if (other.priceUnit != null)
				return false;
		} else if (!priceUnit.equals(other.priceUnit))
			return false;
		return true;
	}
	public String getPriceUnit() {
		return priceUnit;
	}
	public void setPriceUnit(String priceUnit) {
		this.priceUnit = priceUnit;
	}
	public Collect getCollect() {
		return collect;
	}
	public void setCollect(Collect collect) {
		this.collect = collect;
	}

	
}
