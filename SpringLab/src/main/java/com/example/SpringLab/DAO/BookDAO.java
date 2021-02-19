package com.example.SpringLab.DAO;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.SpringLab.entity.Book;


@Component
public class BookDAO {
	
	@Autowired
	private BookRepository repository;
	
	public Collection<Book> getBooks()
	{
		return repository.findAll();
	}
	
	public Book createBook(Book book) {
		return repository.insert(book);
	}
}
