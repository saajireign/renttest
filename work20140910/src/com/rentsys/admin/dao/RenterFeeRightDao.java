package com.rentsys.admin.dao;

import java.util.List;

import com.rentsys.collect.bo.RenterFeeRight;
import com.rentsys.collect.bo.address.Room;
import com.rentsys.dao.DAO;

public interface RenterFeeRightDao extends DAO {
	List<RenterFeeRight> getAllFeeRightsOfRoom(Room room);
}
