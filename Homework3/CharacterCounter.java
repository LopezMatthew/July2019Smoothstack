package com.matthew.smoothstack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CharacterCounter {
	public static void main(String args[]) throws Exception {
		String userInput = args[0];//get the user input and write it to a string
		char searchCharacter = userInput.charAt(0);//write that string to a character
		int count = 0;//create a counter
		
		try {
			File file = new File("C:\\Lorem Ipsum.txt");//try to create a new file object at c
			try(BufferedReader bufferInput = new BufferedReader(new FileReader(file))//create a buffer reader to read from the file
				){
					String readString;//create the string to read the buffer into
					while((readString = bufferInput.readLine())!= null){//while the buffer is being read into the string
						for(int i = 0; i < readString.length();i++) {//iterate over the string
							if(readString.charAt(i) == searchCharacter) {//and compare each character to the search character specified by the user
								count ++;//if the characters match, increase the counter by one
							}
						}
					}
					bufferInput.close();
				 }
		}catch(FileNotFoundException filex){//if the files not found inform the user
			System.out.println("File not found at C:\\Lorem Ipsum.txt, file may not exist");
		}
		System.out.println("The character \""+searchCharacter+"\" appears "+count+" times");//print out the number of times the character was encountered
	}
}
