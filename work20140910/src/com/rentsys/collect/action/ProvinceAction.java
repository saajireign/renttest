package com.rentsys.collect.action;

import pojo.user;
import service.userService;

import com.opensymphony.xwork2.ActionSupport;
import com.rentsys.address.service.ProvinceService;
import com.rentsys.collect.bo.address.ProvinceOrCity;

public class ProvinceAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4964785456186659684L;

	ProvinceService provinceService;
	
	String name;
	
	
	
	public ProvinceService getProvinceService() {
		return provinceService;
	}



	public void setProvinceService(ProvinceService provinceService) {
		this.provinceService = provinceService;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String execute() throws Exception {
		
		ProvinceOrCity province =new ProvinceOrCity();
		province.setProvinceName(name);
		provinceService.addAddress(province);
		return SUCCESS;
	}

	
}
