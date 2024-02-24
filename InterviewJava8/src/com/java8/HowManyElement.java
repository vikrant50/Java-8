package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HowManyElement {

	public static void main(String[] args) 
	{
		
      List<Integer> mylist=Arrays.asList(12,43,432,1,1,32);
      List<Integer> mylist2=Arrays.asList(1,2,3,4,5,61,11,12);
      
      Stream<Integer> g=Stream.concat(mylist.stream(), mylist2.stream());
      Set<Integer> k=  g.collect(Collectors.toSet());
     System.out.println(k);
     
    List<String> o= k.stream().map(n->n+" ").filter(n->n.startsWith("1")).collect(Collectors.toList());
     
     System.out.println(o);
     
     
		
	}

}
