package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindMaxElement {

	public static void main(String[] args) 
	{
		// find maximum element
		//
		List<Integer> list=Arrays.asList(12,34,56,78,99,999);
		
		int maxElement=list.stream().max(Integer::compare).get();
	    System.out.println(maxElement);
		

		int minimumElement =list.stream().min(Integer::compare).get();
		System.out.println(minimumElement);
		
		
	    Optional<Integer> neww=list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(neww);
		
		
	
	}

}
