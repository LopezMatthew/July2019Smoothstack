package com.matthew;

import java.io.*;

public class Menue {
	
	BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));
	String returnCode = "";
	
	public Menue mainMenue() throws IOException{
		boolean flag = true;
		String userInput = "";
		int options = 4;
		
		while(flag == true)
		{
			System.out.println("Welcome to the Library Management System!Please select an option.\n"
					+ "Would you like to:\n"
					+ "1).Review an entry?\n"
					+ "2).Add a new entry?\n"
					+ "3).Update an entry?\n"
					+ "4).Remove an entry?\n"
					);
			try {
			userInput = userInputReader.readLine();
			flag = inputValidation(userInput,options);
			}catch(IOException ioe) {
				System.out.println("User IO Exception");
			}
		}
		returnCode = userInput;
		subMenue();
		cleanUp();
		return mainMenue();
	}
	
private Menue subMenue() throws IOException{
	boolean flag = true;
	String subMenueCode = "";
	int options = 3;
	
	while(flag == true)
	{
		System.out.println("Please select a catagory...\n"
				+ "1).Author Entry\n"
				+ "2).Book Entry\n"
				+ "3).Publisher Entry\n"
				);
				try {
				subMenueCode = userInputReader.readLine();
				flag = inputValidation(subMenueCode,options);
				}catch(IOException ioe) {
					System.out.println("User IO Exception");
				}
	}
			
			returnCode = returnCode + subMenueCode;
			Service.returnCodeProcessor(returnCode);
			return mainMenue();
		}

private boolean inputValidation(String userInput,int numberOfOptions) {
	int check = 0;
	
	try{
		check = Integer.parseInt(userInput);
	}catch(java.lang.NumberFormatException jlfe){
		System.out.println("Invalid option, please enter a valid number entry to indicate your selection.");
		return true;
	}
	
	if(check <= numberOfOptions && check > 0) {
		return false;
	}else {
	System.out.println("Invalid option, please enter a valid number entry to indicate your selection.");
	return true;
	}
}



public void cleanUp() throws IOException{
	userInputReader.close();
}
}
