package com.example.SpringLab.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringLab.entity.Book;
import com.example.SpringLab.service.BookService;


@RestController
@RequestMapping("/books")
public class bookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping
	public Collection<Book> getBooks()
	{
		return (bookService.getBooks());
	}
	
	@PostMapping()
	public Book postBook(@RequestBody Book book) {
	return bookService.createBook(book);
	}

}