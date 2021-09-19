package com.demo.main.test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import com.demo.main.service.StringUtils;

public class ExceptionTest {

	@Test
	public void checkForException() {
		String str=null;
		assertThrows(IllegalArgumentException.class, 
						()-> StringUtils.stringToInteger(str));
	}
}
