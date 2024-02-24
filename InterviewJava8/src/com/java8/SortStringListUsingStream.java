package com.java8;
/*
 Sort a list using java 8
 
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringListUsingStream
{

	public static void main(String[] args)
	{
		List<String> words= Arrays.asList("babu","amit","saja","chacha");
	
		List<String> collect = words.stream().sorted().collect(Collectors.toList());
	
		System.out.println(collect);
	}

}
