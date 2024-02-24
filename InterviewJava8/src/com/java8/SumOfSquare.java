package com.java8;
/*
 find sum of square from List using java 8
input:-   1,2,3,4,5
output:-  sum of sqaure :55 

 */

import java.util.Arrays;
import java.util.List;

public class SumOfSquare 
{

	public static void main(String[] args) 
	{
		List<Integer> numbers=Arrays.asList(1,2,3,4,5);
		
		int sumOfSqure=numbers.stream().mapToInt(n->n*n).sum();

		System.out.println(sumOfSqure);
	}

}
