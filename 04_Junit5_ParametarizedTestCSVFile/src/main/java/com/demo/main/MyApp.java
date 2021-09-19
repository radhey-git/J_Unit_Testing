package com.demo.main;

import com.demo.main.service.CheckOddEven;

public class MyApp {

	public static void main(String[] args) {

		CheckOddEven check=new CheckOddEven();
		String res = check.oddEvenCheck(100);
		System.out.println(res);
	}
}
