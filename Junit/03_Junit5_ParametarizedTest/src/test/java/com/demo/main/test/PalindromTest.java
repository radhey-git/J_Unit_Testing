package com.demo.main.test;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import com.demo.main.service.Palindrom;

public class PalindromTest {

	//test multiple inputs
	@ParameterizedTest 
	//provide different inputs
	@ValueSource(strings = {"madam","liril","radar","racecar","Radhey"})
	public void testPalindrom(String str) {
		Palindrom pal=new Palindrom();
		boolean actual = pal.palindromeCheck(str);
		//if input is true then test success
		//for boolean type input
		assertTrue(actual);
	}
}
