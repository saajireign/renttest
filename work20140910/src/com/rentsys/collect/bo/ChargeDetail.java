package com.rentsys.collect.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/**
 * main category,configuration table
 * 假设以房间数量以及每个房间作为最小的计量单元
 * categoryId取值逻辑如下：
 * 1 固定的收费，而且不用房东录入的内容如房租，网费等，在每次计算金额的时候会自动计算出来。
 * 2 固定的收费，但是需要房东录入一个总量然后根据权重算出来的缴费，如水费，煤气费等。
 * 3 不固定的收费，需要每次对不同的房间分别录入，然后根据权重算出来的缴费。如电费
 * categoryDesc费用描述信息
 * @author Administrator
 *
 */
public class ChargeDetail implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = -8633780671836112377L;
	private Fee fee;
	private String categoryDesc;
	private Long chargeId;
	private String payPeriod;//支付方式：年缴，半年缴，季缴，月缴，其他
	private String payMonth;//支付频率：几个月缴费一次（当payperiod为其他时有值）

	public ChargeDetail(){
		
	}
	public String getCategoryDesc() {
		return categoryDesc;
	}
	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}


	



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((categoryDesc == null) ? 0 : categoryDesc.hashCode());
		result = prime * result
				+ ((chargeId == null) ? 0 : chargeId.hashCode());
		result = prime * result + ((fee == null) ? 0 : fee.hashCode());
		result = prime * result
				+ ((payMonth == null) ? 0 : payMonth.hashCode());
		result = prime * result
				+ ((payPeriod == null) ? 0 : payPeriod.hashCode());
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
		ChargeDetail other = (ChargeDetail) obj;
		if (categoryDesc == null) {
			if (other.categoryDesc != null)
				return false;
		} else if (!categoryDesc.equals(other.categoryDesc))
			return false;
		if (chargeId == null) {
			if (other.chargeId != null)
				return false;
		} else if (!chargeId.equals(other.chargeId))
			return false;
		if (fee == null) {
			if (other.fee != null)
				return false;
		} else if (!fee.equals(other.fee))
			return false;
		if (payMonth == null) {
			if (other.payMonth != null)
				return false;
		} else if (!payMonth.equals(other.payMonth))
			return false;
		if (payPeriod == null) {
			if (other.payPeriod != null)
				return false;
		} else if (!payPeriod.equals(other.payPeriod))
			return false;
		return true;
	}
	public String getPayPeriod() {
		return payPeriod;
	}
	public void setPayPeriod(String payPeriod) {
		this.payPeriod = payPeriod;
	}
	public String getPayMonth() {
		return payMonth;
	}
	public void setPayMonth(String payMonth) {
		this.payMonth = payMonth;
	}

	
	public Fee getFee() {
		return fee;
	}
	public void setFee(Fee fee) {
		this.fee = fee;
	}
	public Long getChargeId() {
		return chargeId;
	}
	public void setChargeId(Long chargeId) {
		this.chargeId = chargeId;
	}
	
	
}
