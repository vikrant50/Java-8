package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheNameWIthACharacter {

	public static void main(String[] args) 
	{
		//write a program to find the name in list which started 'A' character using with java 8
		
		//i/p:-["Amit","Aman", "Ram","Raju"]
		//o/p:- ["Amit","Aman"]
		
		List<String> list = Arrays.asList("Amit","Aman", "Ram","Raju"); 
		List<String> newlist = list.stream().filter(name->name.startsWith("A")).collect(Collectors.toList());
		System.out.println( newlist);

	}

}
