package com.example.SpringLab.DAO;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.SpringLab.entity.Book;


public interface BookRepository extends MongoRepository<Book, Integer>{
	
		 

}
