package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
Group by String of equal length from list using java 8

Input:- "apple", "banana" , "cherry" ,"date" , "grape"
output:- {4=[date], 5=[apple ,grape], 6=[banana,cherry]}
 */
public class GroupListElementByLength {

	public static void main(String[] args) 
	{
		List<String> list=Arrays.asList("apple", "banana" , "cherry" ,"date" , "grape");
		
		Map<Integer ,List<String>> groups=list.stream().collect(Collectors.groupingBy(String::length));
		System.out.println("Group by length "+groups);

		
	}

}
