package com.rentsys.collect.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RoomUnit implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4154400709103509486L;
	/**
	 * 主键，房间id
	 */
	private Integer roomId;
	/**
	 * 房间描述信息
	 */
	private String roomDesc;
	/**
	 * 房间地址
	 */
	private String roomAddress;
	/**
	 * 房间面积
	 */
	private Double roomSquare;
	/**
	 * 房间类型，如一室户，群租，隔间，阁楼等
	 */
	private String roomStyle;
	/**
	 * 租赁房间的要求（如必须为单身，爱干净等）
	 */
	private String roomRequirements;
	List<Appointment> appointments = new ArrayList<Appointment>();
	List<CollectRoomFee> collectRoomFees = new ArrayList<CollectRoomFee>();
	List<UnitRoomVolumn> unitRoomVolumns = new ArrayList<UnitRoomVolumn>();
	public List<CollectRoomFee> getCollectRoomFees() {
		return collectRoomFees;
	}
	public void setCollectRoomFees(List<CollectRoomFee> collectRoomFees) {
		this.collectRoomFees = collectRoomFees;
	}
	public List<UnitRoomVolumn> getUnitRoomVolumns() {
		return unitRoomVolumns;
	}
	public void setUnitRoomVolumns(List<UnitRoomVolumn> unitRoomVolumns) {
		this.unitRoomVolumns = unitRoomVolumns;
	}
	public RoomUnit(){
		
	}
	public List<Appointment> getAppointments() {
		return appointments;
	}
	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}
	public Integer getRoomId() {
		return roomId;
	}
	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}
	public String getRoomDesc() {
		return roomDesc;
	}
	public void setRoomDesc(String roomDesc) {
		this.roomDesc = roomDesc;
	}
	public String getRoomAddress() {
		return roomAddress;
	}
	public void setRoomAddress(String roomAddress) {
		this.roomAddress = roomAddress;
	}
	public Double getRoomSquare() {
		return roomSquare;
	}
	public void setRoomSquare(Double roomSquare) {
		this.roomSquare = roomSquare;
	}
	public String getRoomStyle() {
		return roomStyle;
	}
	public void setRoomStyle(String roomStyle) {
		this.roomStyle = roomStyle;
	}
	public String getRoomRequirements() {
		return roomRequirements;
	}
	public void setRoomRequirements(String roomRequirements) {
		this.roomRequirements = roomRequirements;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((roomId == null) ? 0 : roomId.hashCode());
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
		RoomUnit other = (RoomUnit) obj;
		if (roomId == null) {
			if (other.roomId != null)
				return false;
		} else if (!roomId.equals(other.roomId))
			return false;
		return true;
	}

	
}
