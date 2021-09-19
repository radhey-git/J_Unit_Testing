package com.demo.main.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Matchers.anyString;

import org.junit.jupiter.api.Test;
import org.powermock.api.mockito.PowerMockito;
import com.demo.main.dao.UserDao;
import com.demo.main.service.UserService;

public class UserServiceTest {

	// Test Case for Service getNameById()
	@Test
	public void testGetNameById() {
		// Creating Mock Object of UserDao Interface
		UserDao userDao = PowerMockito.mock(UserDao.class);
		// Mocking for findNameById(Integer id)
		PowerMockito.when(userDao.findNameById(101)).thenReturn("Radhey");
		// injecting mock object of userDao
		UserService service = new UserService(userDao);
		String name = service.getNameById(101);
		// comparing expected & actual
		assertEquals("Radhey", name);
	}

	// Test Case for Service getEmailById()
	@Test
	public void testGetEmailById() {
		// Creating Mock Object of UserDao Interface
		UserDao userDao = PowerMockito.mock(UserDao.class);
		// Mocking for findEmailById(Integer id)
		PowerMockito.when(userDao.findEmailById(101)).thenReturn("radheygarode@gmail.com");
		// injecting mock object of userDao
		UserService service = new UserService(userDao);
		String name = service.getEmailById(101);
		// comparing expected & actual
		assertEquals("radheygarode@gmail.com", name);
	}
	
	//Testing Void Method
	@Test
	public void testDoProcess() {
		// Creating Mock Object of UserService Class
		UserService mockService=PowerMockito.mock(UserService.class);
		try {
			//method return type is void then doNothing()
			PowerMockito.doNothing().when(mockService, "pushMsgToKafkaTopic", anyString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Testing Private Method
	@Test
	public void testDoWorkWithPrivateMethodMock() throws Exception {
		UserService service=new UserService();
		//Creating Spy for private method
		UserService spy = PowerMockito.spy(service);
	
		//creating mock response
		PowerMockito.doReturn("TEST MSG").when(spy,"formatMsg","test msg");
		
		String formatedMsg = service.doWork("test msg");
		assertEquals("TEST MSG", formatedMsg);
	}
}
