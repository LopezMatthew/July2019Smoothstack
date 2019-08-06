package com.matthew;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		//first check to see that the database file exists
		File databaseFile = new File("dataBaseFile");
		if(databaseFile.exists()) {
		
			Menue callMenue = new Menue();
			callMenue.mainMenue();
			
		}else {
			System.out.println("Database file not found, start new database?");
		} 
		
	}

}
