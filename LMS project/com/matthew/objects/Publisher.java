package com.matthew.objects;

import java.util.ArrayList;
import java.util.List;

public class Publisher {

	public String name = " ";
	private List<Book> books = new ArrayList<>();
	private List<Author> authors = new ArrayList<>();
	private String publisherID = " ";
	
	public String returnName(){
		return name;
	}
	
}
