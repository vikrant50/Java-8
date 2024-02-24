package com.java8.awesome;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {

	public static void main(String[] args)
	{
		List<String> words=Arrays.asList("Hello","world","how","are","you");
	
		//print started with H ....use of filter
		words.stream().
		   filter(e->e.toLowerCase().startsWith("h")).
		      forEach(System.out::println);
		System.out.println("----------------------------------");
		
		//use of map
		words.stream().map(String::toUpperCase).forEach(System.out::println);
		
		//using lamda exp 
		words.stream().map(n->n.toLowerCase()).forEach(System.out::print);
		
		System.out.println("----------------------------------");
		
		//use of reduce()
		String reduce=words.stream().reduce(" ",(a,b)->a+" "+b);
		System.out.println(reduce);
		
		 
		
	}

}
