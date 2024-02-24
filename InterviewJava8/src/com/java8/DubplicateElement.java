package com.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;



public class DubplicateElement
{

	public static void main(String[] args)
	{

		List<Integer> myList=Arrays.asList(10,3,45,3,45,45);
		
		Set<Integer> check = new HashSet();		
		
		//myList.stream().filter(n->!check.add(n)).forEach(System.out::println);
		
		myList.stream().filter(n->!check.add(n)).forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
	}

}
