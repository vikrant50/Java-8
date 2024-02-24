package com.java8.awesome;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo3 {

	public static void main(String[] args) 
	{
		// 
		List<Integer> list=Arrays.asList(10,20,30,50,70,80);  
	    List<Integer> evenPrint=	list.stream().filter(n->n%2==0).collect(Collectors.toList());
	    System.out.println(evenPrint);
	    
	    
	    
	    
	}

}
