package com.rentsys.collect.bo.address;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.rentsys.collect.bo.RoomUnit;

public class Room implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3950642137834932085L;
	private String roomName;
	private Integer roomId;
	private Building building;
	private List<RoomUnit> roomUnits = new ArrayList<RoomUnit>();
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((building == null) ? 0 : building.hashCode());
		result = prime * result + ((roomId == null) ? 0 : roomId.hashCode());
		result = prime * result
				+ ((roomName == null) ? 0 : roomName.hashCode());
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
		Room other = (Room) obj;
		if (building == null) {
			if (other.building != null)
				return false;
		} else if (!building.equals(other.building))
			return false;
		if (roomId == null) {
			if (other.roomId != null)
				return false;
		} else if (!roomId.equals(other.roomId))
			return false;
		if (roomName == null) {
			if (other.roomName != null)
				return false;
		} else if (!roomName.equals(other.roomName))
			return false;
		return true;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public Integer getRoomId() {
		return roomId;
	}
	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}
	public Building getBuilding() {
		return building;
	}
	public void setBuilding(Building building) {
		this.building = building;
	}
	public List<RoomUnit> getRoomUnits() {
		return roomUnits;
	}
	public void setRoomUnits(List<RoomUnit> roomUnits) {
		this.roomUnits = roomUnits;
	}
}
