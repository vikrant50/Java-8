package com.java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FIND_FIRST_NON_REPEATING_CHARACTER {

	public static void main(String[] args) 
	{
		String str= "student technique ";
	
	   //this is first non repeated character :----------------------
	   Map<Character,Long> data = str.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	   
      Optional<Character> nonRepeated = data.entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).findFirst();
	  System.out.println(nonRepeated.get());
		
		//this is first repeated chracter
		Map<Character,Long> data1=	str.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		
        Optional<Character> Repeated = data1.entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()).findFirst();
	   System.out.println(Repeated.get());
	}

}
