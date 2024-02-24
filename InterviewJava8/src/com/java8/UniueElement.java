package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UniueElement
{

	public static void main(String[] args) 
	{
		List<Integer> mylist=Arrays.asList(1,2,3,4,4,5,6,7,8,6,4,3,4);

	     Set<Integer> unique =	mylist.stream().collect(Collectors.toSet());
    	 System.out.println(unique);
	
	      unique.stream().sorted().forEach(System.out::print);
		

	 
	}

}
