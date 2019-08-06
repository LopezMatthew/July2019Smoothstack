package com.matthew;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.matthew.objects.Author;
import com.matthew.objects.Book;

public class Service {
	static BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));
	
	static void returnCodeProcessor(String returnCode) {
		switch(returnCode) {
		case "11":
			reviewAuthor();
			break;
		case "12":
			reviewBook();
			break;
		/*	case "13":
			reviewPublisher();
			break;
		case "21":
			addAuthor();
			break;
	*/	case "22":
			addBook();
			break;/*
		case "23":
			addPublisher();
			break;
		case "31":
			editAuthor();
			break;
		case "32":
			editBook();
			break;
		case "33":
			editPublisher();
			break;
		case "41":
			deleteAuthor();
			break;
		case "42":
			deleteBook();
			break;
		case "43":
			deletePublisher();
			break; */
		default:
		}
	}
	private static void reviewAuthor() {
		//call up the csv and print every instance of that authors work that appears
		//each of these should be comprised of two functions, an action function and a display function. the review functions will
		//probably only need the display function
		
	}
	public static void reviewBook() {
		
		System.out.println("You are reviewing a book entry, please select an entry to review.\n");
		DAO.readBooks();
		
	}
	
	public static void addAuthor() {
		Author author = new Author();
		String authorName = "";
		System.out.println("You are adding a new author, please enter the following information.\n"
				+ "What is the authors name?\n");
		try {
			authorName = userInputReader.readLine();
		}catch(IOException ioe){
			
		}
		System.out.println("List any number of books the author has written here. ");
		//loop for adding books
		System.out.println("List any number of publishers that this author has worked with here");
		//loop for adding publishers
		System.out.println("Author added");
		//displpay author and give the option to return to main menue
	}
	
	public static void addBook() {
		Book book = new Book();
		
		String bookTitle = " ";
		String author = " ";
		String publisher = " ";
		
		System.out.println("You are adding a new book, please enter the folowing information\n"
				+ "What is the books title?");
		
		try {
			bookTitle = userInputReader.readLine();
		
			System.out.println("Please enter the books author");
			author = userInputReader.readLine();
		
			System.out.println("Finally please enter the books publisher");
			publisher = userInputReader.readLine();
		}catch(IOException ioe) {
			
		}
		
		book.populate(bookTitle,author,publisher);
		DAO.save(formatObject(book));
		
	}

	public static String formatObject(Book book) {
		return book.returnTitle() + "," + book.returnAuthor() + "," + book.returnPublisher() + "," + book.returnID();
		
	}

}

