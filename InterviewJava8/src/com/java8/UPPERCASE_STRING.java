package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UPPERCASE_STRING {

	public static void main(String[] args) 
	{
	List<String> l=Arrays.asList("aa","cc","dd");
	
	List<String> convert=l.stream().map(String::toUpperCase).collect(Collectors.toList());
	System.out.println(convert);

	}

}
