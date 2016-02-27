package com.rentsys.collect.bo;

import java.io.Serializable;
import java.math.BigDecimal;

public class CollectRoomFee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1710552979102984999L;
	private RoomUnit roomUnit;
	private CollectFee collectFee;
	private BigDecimal roomFeeAmount;
	private BigDecimal roomFeeSum;
	private String collectRoomFeeStatus;
	private Long recordId;
	public CollectRoomFee(){
		
	}
	public RoomUnit getRoomUnit() {
		return roomUnit;
	}
	public void setRoomUnit(RoomUnit roomUnit) {
		this.roomUnit = roomUnit;
	}

	public BigDecimal getRoomFeeAmount() {
		return roomFeeAmount;
	}
	public void setRoomFeeAmount(BigDecimal roomFeeAmount) {
		this.roomFeeAmount = roomFeeAmount;
	}
	public String getCollectRoomFeeStatus() {
		return collectRoomFeeStatus;
	}
	public void setCollectRoomFeeStatus(String collectRoomFeeStatus) {
		this.collectRoomFeeStatus = collectRoomFeeStatus;
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
	
	public BigDecimal getRoomFeeSum() {
		return roomFeeSum;
	}
	public void setRoomFeeSum(BigDecimal roomFeeSum) {
		this.roomFeeSum = roomFeeSum;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((collectFee == null) ? 0 : collectFee.hashCode());
		result = prime
				* result
				+ ((collectRoomFeeStatus == null) ? 0 : collectRoomFeeStatus
						.hashCode());
		result = prime * result
				+ ((recordId == null) ? 0 : recordId.hashCode());
		result = prime * result
				+ ((roomFeeAmount == null) ? 0 : roomFeeAmount.hashCode());
		result = prime * result
				+ ((roomFeeSum == null) ? 0 : roomFeeSum.hashCode());
		result = prime * result
				+ ((roomUnit == null) ? 0 : roomUnit.hashCode());
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
		CollectRoomFee other = (CollectRoomFee) obj;
		if (collectFee == null) {
			if (other.collectFee != null)
				return false;
		} else if (!collectFee.equals(other.collectFee))
			return false;
		if (collectRoomFeeStatus == null) {
			if (other.collectRoomFeeStatus != null)
				return false;
		} else if (!collectRoomFeeStatus.equals(other.collectRoomFeeStatus))
			return false;
		if (recordId == null) {
			if (other.recordId != null)
				return false;
		} else if (!recordId.equals(other.recordId))
			return false;
		if (roomFeeAmount == null) {
			if (other.roomFeeAmount != null)
				return false;
		} else if (!roomFeeAmount.equals(other.roomFeeAmount))
			return false;
		if (roomFeeSum == null) {
			if (other.roomFeeSum != null)
				return false;
		} else if (!roomFeeSum.equals(other.roomFeeSum))
			return false;
		if (roomUnit == null) {
			if (other.roomUnit != null)
				return false;
		} else if (!roomUnit.equals(other.roomUnit))
			return false;
		return true;
	}
	
}
