package com.rentsys.collect.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**
 * 设备当成租客，每个月也交房租~
 * 其他字段还没有想好，留待下个版本升级
 * @author Administrator
 *
 */
public class Equipment extends Renter implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8916325402388979904L;
	private BigDecimal buyPrice;
	private Date buyDate;
	private Long yearOfGuarenteeRepire;
	private Long repiredTimes;
	private Date latestRepireDate;
	public BigDecimal getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(BigDecimal buyPrice) {
		this.buyPrice = buyPrice;
	}
	public Date getBuyDate() {
		return buyDate;
	}
	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}
	public Long getYearOfGuarenteeRepire() {
		return yearOfGuarenteeRepire;
	}
	public void setYearOfGuarenteeRepire(Long yearOfGuarenteeRepire) {
		this.yearOfGuarenteeRepire = yearOfGuarenteeRepire;
	}
	public Long getRepiredTimes() {
		return repiredTimes;
	}
	public void setRepiredTimes(Long repiredTimes) {
		this.repiredTimes = repiredTimes;
	}
	public Date getLatestRepireDate() {
		return latestRepireDate;
	}
	public void setLatestRepireDate(Date latestRepireDate) {
		this.latestRepireDate = latestRepireDate;
	}
}
