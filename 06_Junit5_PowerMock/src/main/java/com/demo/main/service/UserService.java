package com.demo.main.service;

import com.demo.main.dao.UserDao;

public class UserService {

	private UserDao userDao;

	public UserService() {
	}
	//Dependency Injection
	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}

	public String getNameById(Integer id) {
		String name = userDao.findNameById(id);
		return name;
	}

	public String getEmailById(Integer id) {
		String email = userDao.findEmailById(id);
		return email;
	}
	
	public void doProcess() {
		System.out.println("doProcess() START");
		pushMsgToKafkaTopic("msg");
		System.out.println("doProcess() END");
	}
	public void pushMsgToKafkaTopic(String string) {
		System.out.println("msg pushing To Kafka...");
	}
	
	public String doWork(String msg) {
		String formatMsg = formatMsg(msg);
		return formatMsg;
	}
	
	private String formatMsg(String msg) {
		return msg.toUpperCase();
	}
}
