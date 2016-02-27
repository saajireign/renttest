package com.rentsys.address.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rentsys.address.dao.ProvinceOrCityDao;
import com.rentsys.address.service.ProvinceService;
import com.rentsys.collect.bo.address.ProvinceOrCity;
import com.rentsys.collect.bo.address.Region;
import com.rentsys.collect.bo.address.Room;
import com.rentsys.collect.bo.address.Street;
@Service
@Transactional
public class ProvinceServiceImpl implements ProvinceService{
	ProvinceOrCityDao provinceDao;
	public ProvinceOrCityDao getProvinceDao() {
		return provinceDao;
	}

	public void setProvinceDao(ProvinceOrCityDao provinceDao) {
		this.provinceDao = provinceDao;
	}



	@Override
	public List<Region> getRegionsByProvince(ProvinceOrCity province) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Street> getStreetsByProvince(ProvinceOrCity province) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Room> getRoomsByProvince(ProvinceOrCity province) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProvinceOrCity> getByName(String name) {
		// TODO Auto-generated method stub
		return provinceDao.getByProvinceName(name);
	}

	@Override
	public Boolean addAddress(ProvinceOrCity address) {
		// TODO Auto-generated method stub
		try{
			provinceDao.saveObject(address);
		}catch(Exception ex){
			return false;
		}
		return true;
	}

	@Override
	public List<ProvinceOrCity> getAll() {
		// TODO Auto-generated method stub
		return provinceDao.getObjectList();
	}



}
