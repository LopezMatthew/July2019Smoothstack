package com.matthew.objects;



public class Book {
private String title = " ";
private Author author;
private Publisher publisher;
private String bookID = " ";//TODO

	public void populate(String importTitle, String importAuthor, String importPublisher){
		//for creating a new book
		author = new Author();
		publisher = new Publisher();
		
		title = importTitle;
		author.name = importAuthor;
		publisher.name = importPublisher;
	}
	public String returnTitle() {
		return title;
	}
	public String returnAuthor() {
		return author.returnName();
	}
	public String returnPublisher() {
		return publisher.returnName();
	}
	public String returnID() {
		return bookID;
	}

}
