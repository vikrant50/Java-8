package com.java8.awesome;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMethodDemo5 {

	public static void main(String[] args)
	{
	//1>distinct():- return a stream with distinct elements(removes duplicates)
		
		//from integer
		List<Integer> list=Arrays.asList(1,23,434,12,1,23,4,56,3,2);
		List<Integer> dd=list.stream().distinct().collect(Collectors.toList());
		System.out.println("duplicate integer removed "+dd);
		
		//from String 
		List<String> list2=Arrays.asList("hello","is","me","hello");	
		List<String> sl=list2.stream().distinct().collect(Collectors.toList());
		System.out.println("Duplicate string removed "+sl);
		
	   //2.sorted():-sort int and string 
		List<String> afterSortString=sl.stream().sorted().collect(Collectors.toList());
	    System.out.println(afterSortString);
	    
	    //3>limit(long maxSize):-Return a stream truncated to the specified size
	    //i want only 5 digit from list
	    list.stream().limit(5).forEach(System.out::println);
	    
	}

}
