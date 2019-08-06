package com.matthew;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BasicLambdas {
	public static void main(String Args[]) {
        List<String> testArray = new ArrayList<String>();
		testArray.add("amy");
		testArray.add("michael");
		testArray.add("jeffrey");
		testArray.add("eric");
		testArray.add("matthew");
		testArray.add("ben");
		testArray.add("noah");
		testArray.add("jacob");
		testArray.add("brittany");
		testArray.add("ant");
		
		System.out.println("Sorted by Alphabetical order");
		testArray.stream().sorted().forEach(System.out::println);
		System.out.println();
		
		System.out.println("by length");
		testArray.stream().sorted((aName,bName)->aName.length()-bName.length()).forEach(System.out::println);
		System.out.println();
		
		System.out.println("Reverse length");
		testArray.stream().sorted(Comparator.comparingInt(String::length).reversed()).forEach(System.out::println);
		System.out.println();
		
		System.out.println("E");
		testArray.stream().filter(e->e.startsWith("e")).forEach(System.out::println);
		testArray.stream().filter(e->!e.startsWith("e")).forEach(System.out::println);
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(5);
		intList.add(12);
		intList.add(20);
		intList.add(10);
		System.out.println();
		
		System.out.println("Evens and odds");
		String outString = intList.stream().map(i->i % 2 ==0 ? "E" + i:"O" + i).collect(Collectors.joining(","));
		System.out.println(outString);
		System.out.println();
		
		System.out.println("Starts with a and has 3 characters.");
		testArray.stream().filter(e->e.startsWith("a")).filter(e->e.length() == 3).forEach(System.out::println);
	}
}
