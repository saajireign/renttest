package com.rentsys.collect.bo;

import java.io.Serializable;
import java.math.BigDecimal;

public class CollectRoomFee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1710552979102984999L;
	private RoomUnit roomUnit;
	private Collect collect;
	private BigDecimal roomFeeAmount;
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
	public Collect getCollect() {
		return collect;
	}
	public void setCollect(Collect collect) {
		this.collect = collect;
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
		CollectRoomFee other = (CollectRoomFee) obj;
		if (recordId == null) {
			if (other.recordId != null)
				return false;
		} else if (!recordId.equals(other.recordId))
			return false;
		return true;
	}
}
