package com.junit.main.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import com.junit.main.service.WelcomeService;
import com.junit.main.rest.WelcomeController;

//defining Target Class which we are going to test
@WebMvcTest(value = WelcomeController.class)
public class TestWelcomeController {

	//creating MOCK object
	@MockBean
	private WelcomeService welcomeService;
	
	//this component is used to send request to REST Controller
	@Autowired
	private MockMvc mockMVC;
	
	@Test
	public void testWist() throws Exception {
		//MOCKING...
		when(welcomeService.getWelcomeMsg())
						   .thenReturn("WelcomeToREST_CntrollerTest..!!");
		
		//We cannot create object for rest controller 
		//we can send request to access them
		
		//building get Request
		MockHttpServletRequestBuilder reqBuilder 
							= MockMvcRequestBuilders.get("/welcome");
		//executing get request
		ResultActions perform = mockMVC.perform(reqBuilder);
		//getting result
		MvcResult mvcResult = perform.andReturn();
		//getting response
		MockHttpServletResponse response = mvcResult.getResponse();
		//getting status
		int status = response.getStatus();
		//comparing expected with actual
		assertEquals(200, status);
	}
}
