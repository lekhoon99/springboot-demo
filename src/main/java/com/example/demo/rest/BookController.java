package com.example.demo.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Book;

@RestController
public class BookController {
	
	@GetMapping("/books") 
	public List<Book> getAllBooks() {
		return Arrays.asList(new Book("1", "My Book"));
	}
}
