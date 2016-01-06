package stru;

import pojo.user;
import service.userService;

import com.opensymphony.xwork2.ActionSupport;

public class userAction extends ActionSupport {

	userService us;
	
	String name;
	double money;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getMoney() {
		return money;
	}



	public void setMoney(double money) {
		this.money = money;
	}



	public userService getUs() {
		return us;
	}



	public void setUs(userService us) {
		this.us = us;
	}



	@Override
	public String execute() throws Exception {
		
		user u =new user(name,money);
		
		us.saveuser(u);
		return SUCCESS;
	}

	
}
