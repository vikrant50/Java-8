package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 input:- 1,2,3,4,5
 output:- [2,4,6,8,10]
 */
public class DoubleEachElement {

	public static void main(String[] args) 
	{
		List<Integer> numbers=Arrays.asList(1,2,3,4,5);
		
		List<Integer> doubleele=numbers.stream().map(n->n*2).collect(Collectors.toList());
		System.out.println(doubleele);
		
		List<Integer> collect = numbers.stream().map(n->n*n).collect(Collectors.toList());
		System.out.println(collect);
	}

}
