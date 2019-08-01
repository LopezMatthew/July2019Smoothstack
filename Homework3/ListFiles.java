package com.matthew.smoothstack;
import java.io.*;
public class ListFiles {
	public static void main(String args[]) {
		try {
			String filePath = args[0];
			File folder = new File(filePath);
			listFilesForFolder(folder);
		}catch(ArrayIndexOutOfBoundsException exception){
			System.out.println("Please enter a valid file path");
		}
}
public static void listFilesForFolder(final File folder) {
    for (final File fileEntry : folder.listFiles()) {
    	System.out.println(fileEntry.getName());
    }
}


}
