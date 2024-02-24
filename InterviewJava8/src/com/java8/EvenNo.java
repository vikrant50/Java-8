 package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNo {

	public static void main(String[] args) 
	{
		// print even no and odd no in given no
	    
		
	  List<Integer> list=Arrays.asList(12,34,56,75,43,1,2,4,5,3);
	  List<Integer> even= list.stream().filter(n->n%2==0).collect(Collectors.toList());
	  List<Integer> odd=  list.stream().filter(n->n%2!=0).collect(Collectors.toList()); 
	  System.out.println("Even number "+even);
		System.out.println("odd number "+odd);
		
	
		
	
		
		
	}

}
