package com.matthew;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class DAO {
	
	static File inputFile = new File("dataBaseFile");
	
	public static List<String> readBooks() {
		try {
			BufferedReader fileIN = new BufferedReader(new FileReader(inputFile));
			String inputString = "";
			List<String> stringList = new ArrayList<>();
		
			while((inputString = fileIN.readLine())!= null) {
				stringList.add(inputString);
			}
			fileIN.close();
			return stringList;
		}catch(IOException ioe) {
			System.out.println("Ioexception when reading from input file for display books function");
			return null;
		}
	}
	
	public static void save(String formatedInput) {
		try {
		BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile,true));
		writer.write(formatedInput);
		writer.newLine();
		writer.close();
		}catch(IOException ioe) {
			
		}
		
	}
}
