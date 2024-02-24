 package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*

 input:-1,2,3,4,5
 output:- [1,2,3,4,5]
 
 */
public class FindUniqueElement
{
	public static void main(String[] args)
	{
		List<Integer> number =Arrays.asList(1,2,2,3,4,4,5);
  
	    List<Integer> collect = number.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
	}

}
