package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class COUNT_STRING_WHOSE_LENGTH_ISGREATETHAT_THREE {

	public static void main(String[] args) 
	{
		List<String> list=Arrays.asList("Java","C","ami","rahul","pr");
		
		
	    List<String> collect = list.stream().filter(e->e.length()>3).collect(Collectors.toList());
	    System.out.println(collect);
	   
	   
	   

	}

}
