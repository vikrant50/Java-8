package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindSecondLargestElement
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(12,223,43,132);
//		List<Integer> collect = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//		System.out.println(collect.get(1));
		
     Optional<Integer> findFirst = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
	System.out.println(findFirst);
	}

}
