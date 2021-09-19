package com.demo.main.dao;

public class DaoImpl implements UserDao{

	@Override
	public String findNameById(Integer id) {
		System.out.println("findNameById() called...");
		return "Radhey";
	}

	@Override
	public String findEmailById(Integer id) {
		System.out.println("findEmailById() called...");
		return "radheygarode@gmail.com";
	}
}
