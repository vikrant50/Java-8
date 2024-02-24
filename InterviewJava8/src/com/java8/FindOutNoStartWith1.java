package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindOutNoStartWith1 {

	public static void main(String[] args)
	{
		//which no start with 1 then print that no 
   //	List<Integer> mylist=Arrays.asList(12,34,56,7,111,12,34,10);		
		
		
		List<Integer> mylist=Arrays.asList(12,34,56,7,111,12,34,10);
		
		List<String> collect = mylist.stream().map(n->n+" ").filter(n->n.startsWith("1")).collect(Collectors.toList());
		
		System.out.println(collect);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
	
		
		

	}

}
