package com.rentsys.collect.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

public class UnitRoomVolumn implements Serializable {

	/**
	 *按户算的费用流量如电费，水费需要录入的 ，户为基本单位，最后转化成人员
	 */
	private static final long serialVersionUID = 8087770954963094451L;
	private Long recordId;
	private RoomUnit roomUnit;
	private Date recordDate;
	private BigDecimal volumn;
	private Fee fee;
	public UnitRoomVolumn(){
		
	}
	public RoomUnit getRoomUnit() {
		return roomUnit;
	}
	public void setRoomUnit(RoomUnit roomUnit) {
		this.roomUnit = roomUnit;
	}
	
	public BigDecimal getVolumn() {
		return volumn;
	}
	public void setVolumn(BigDecimal volumn) {
		this.volumn = volumn;
	}
	public Fee getFee() {
		return fee;
	}
	public void setFee(Fee fee) {
		this.fee = fee;
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
		UnitRoomVolumn other = (UnitRoomVolumn) obj;
		if (recordId == null) {
			if (other.recordId != null)
				return false;
		} else if (!recordId.equals(other.recordId))
			return false;
		return true;
	}
	public Date getRecordDate() {
		return recordDate;
	}
	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}
}
