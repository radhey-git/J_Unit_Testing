package com.demo.main.service;

public class Palindrom {

	public boolean palindromeCheck(String str) {
		
		String reverse;
		
		StringBuilder builder=new StringBuilder(str);
		builder=builder.reverse();
		
		reverse=builder.toString();
		System.out.println(reverse);
		if(str.equals(reverse)) {
			return true;
		}
		return false;
	}
}
