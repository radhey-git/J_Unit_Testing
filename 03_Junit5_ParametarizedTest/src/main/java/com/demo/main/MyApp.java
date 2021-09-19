package com.demo.main;

import com.demo.main.service.Palindrom;

public class MyApp {

	public static void main(String[] args) {

		Palindrom pal = new Palindrom();

		boolean palindromeCheck = pal.palindromeCheck("liril");
		System.out.println(palindromeCheck);
	}
}
