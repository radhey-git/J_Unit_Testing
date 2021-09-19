package com.junit.main.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.junit.main.binding.Book;
import com.junit.main.rest.BookRestController;
import com.junit.main.service.BookService;

@WebMvcTest(value = BookRestController.class)
public class TestBookRestController {

	@MockBean
	private BookService bookService;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testAddBook() throws Exception {
		when(bookService.saveBook(ArgumentMatchers.any())).thenReturn(true);
		//Create Book Object
		Book book=new Book(100,"Spring",200.00);
		//Convert it into JSON
		ObjectMapper mapper=new ObjectMapper();
		String bookJSON = mapper.writeValueAsString(book);
		
		//binding POST Request
		MockHttpServletRequestBuilder reqBuilder 
				= MockMvcRequestBuilders.post("/save")
										.contentType(MediaType.APPLICATION_JSON)
										.content(bookJSON);
		ResultActions perform = mockMvc.perform(reqBuilder);
		
		MvcResult mvcResult = perform.andReturn();
		
		MockHttpServletResponse response = mvcResult.getResponse();
		
		int status = response.getStatus();
		
		assertEquals(201, status);
	}
}
