package com.matthew.objects;

import java.util.ArrayList;
import java.util.List;

public class Author {

	public String name = "";
	private List<Book> books = new ArrayList<>();
	private List<Publisher> publishers = new ArrayList<>();
	
	void populate(String x, String[] y,String z) {
		
	}
	public String returnName() {
		return name;
	}
	
}
