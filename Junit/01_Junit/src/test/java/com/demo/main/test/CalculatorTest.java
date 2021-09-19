package com.demo.main.test;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import com.demo.main.service.Calculator;
public class CalculatorTest {

	private static Calculator cal;
	
	//this method will execute before All method
	@BeforeClass
	public static void init() {
		cal=new Calculator();
	}
	
	//this method will execute after All method
	@AfterClass
	public static  void destory() {
		cal=null;
	}
	
	@Test//represent as a test case
	public void testAdd() {
		Integer actualResult = cal.add(10, 20);
		Integer expectedResult=30;
		//here we performing assertion
		//comparing actual result with expected one
		assertEquals(expectedResult, actualResult);
	}
	
	@Test//represent as a test case
	public void testSub() {
		Integer actualResult = cal.sub(20, 10);
		Integer expectedResult=30;
		//here we performing assertion
		//comparing actual result with expected one
		assertEquals(expectedResult, actualResult);
	}
	
	
}
