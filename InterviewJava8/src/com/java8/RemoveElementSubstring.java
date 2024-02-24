package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 Remove String from list which has 'an' present in it using java 8
 input:- "apple","banana","cherry","kiwi"
 output:- "apple","cherry","kiwi"
 */
public class RemoveElementSubstring {

	public static void main(String[] args)
	{
	
		List<String> list=Arrays.asList("apple","banana","cherry","kiwi");
		
		String substringToRemove="a";
		
		List<String> ff=list.stream().filter(word->!word.contains(substringToRemove)).collect(Collectors.toList());
	
	   System.out.println(ff);
	}

}
