package com.junit.main.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.junit.main.binding.Book;
import com.junit.main.service.BookService;

@RestController
public class BookRestController {

	@Autowired
	private BookService service;
	
	@PostMapping(value = "/save",consumes = "application/json")
	public ResponseEntity<String> addBook(@RequestBody Book book){
		String msg=null;
		boolean isTrue = service.saveBook(book);
		if(isTrue) {
			msg="Book Saved Successfully..!!";
			return new ResponseEntity<>(msg,HttpStatus.CREATED);
		}
		else {
			msg="Book Not saved";
			return new ResponseEntity<>(msg,HttpStatus.BAD_REQUEST);
		}
	}
}
