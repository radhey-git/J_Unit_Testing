package com.junit.main.service;

import org.springframework.stereotype.Service;
import com.junit.main.binding.Book;

@Service
public class BookService {

	public boolean saveBook(Book book) {
		return true;
	}
}
