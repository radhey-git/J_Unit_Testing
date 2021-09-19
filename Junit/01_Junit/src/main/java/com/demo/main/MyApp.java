package com.demo.main;

import com.demo.main.service.Calculator;

public class MyApp {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.add(10, 20));
		
		System.out.println(cal.sub(20, 10));
	}
}
