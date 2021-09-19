package com.demo.main.service;

public class CheckOddEven {

	public String oddEvenCheck(Integer number) {
		
		if(number%2==0)
		{
			return "even";
		}
		return "odd";
	}
}
