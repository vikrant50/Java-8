package com.java8;

import java.util.Arrays;
import java.util.List;

public class SortedElement {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(1,23,213,4,54212,23,43,22,23);
		
		
		list.stream().sorted().forEach(System.out::println);
		

	}

}
