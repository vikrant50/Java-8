package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindSquareOfGivenAllNo 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Integer> integers= Arrays.asList(4,5,20,7,10,9);
		

		integers.stream().mapToInt(n->n*n).forEach(System.out::println);
	}

}
