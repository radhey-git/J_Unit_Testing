package com.demo.main.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import com.demo.main.service.CheckOddEven;

public class OddOrEvenTest {

	@ParameterizedTest
	//csv file path
	//which line to be Skied
	@CsvFileSource(resources = "/data.csv",numLinesToSkip = 1)
	public void numberTest(String input,String expected) {
		System.out.println(input);
		CheckOddEven check=new CheckOddEven();
		//String to integer
		String actual = check.oddEvenCheck(Integer.parseInt(input));
		assertEquals(expected, actual);	
	}
}
