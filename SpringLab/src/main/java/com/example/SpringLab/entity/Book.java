package com.example.SpringLab.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="Book")
public class Book {
	
	int id;
	String title;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	String author;
	
	

}
