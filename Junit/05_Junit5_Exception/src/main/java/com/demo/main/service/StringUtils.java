package com.demo.main.service;

public class StringUtils {

	public static Integer stringToInteger(String str) {
		
		if(str==null||str.trim().length()==0) {
			throw new IllegalArgumentException("String Must Not Be Null");
		}
		return Integer.valueOf(str);
	}
}
