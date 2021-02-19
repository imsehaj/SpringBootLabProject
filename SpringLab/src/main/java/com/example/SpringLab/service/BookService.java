package com.example.SpringLab.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringLab.DAO.BookDAO;
import com.example.SpringLab.entity.Book;

@Service
public class BookService {
	
	@Autowired
	private BookDAO bookDAO;
	
	public Collection<Book> getBooks()
	{
		return bookDAO.getBooks();
	}

	public Book createBook(Book book) {
		
		return bookDAO.createBook(book) ;
	}
	
	

}
