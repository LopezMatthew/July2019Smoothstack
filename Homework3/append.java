package com.matthew.smoothstack;

import java.io.*;

public class append {
	public static void main(String args[]) throws IOException {

	    	try(BufferedWriter writer = new BufferedWriter(//new buffer writer in a try with resources statement
	    			new FileWriter("C:\\testfile.txt", true) //new file writer at C
	    			); ){
	    	for(String textToAppend : args){//for the strings listed in args
		    writer.write(textToAppend + " ");//write the strings to the testfile
	    	}
	    	writer.newLine();//write a newline so that whatever is written next is on its own line
		    writer.close();//close the writer
	    }
	}
}
