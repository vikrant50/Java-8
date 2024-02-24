package com.java8.awesome;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsMethodDemo7 {

	public static void main(String[] args)
	{
		
		List<Integer> list=Arrays.asList(1,-2,2,3,4,5,6);
		
		//counting()
		Long collect=list.stream().collect(Collectors.counting());
		System.out.println(collect);
		
		//groupingBy()
		Map<Integer,Long> collect2=list.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()));
         System.out.println(collect2);
         
       //  averaging 
      Double d=  list.stream().collect(Collectors.averagingInt(n->n));
        System.out.println(d);	
        
        //minBy
        Integer integer= list.stream().collect(Collectors.minBy(Integer::compareTo)).get();
	    System.out.println("min"+integer);
	
	    //maxBy
	    Integer integer2= list.stream().collect(Collectors.maxBy(Integer::compareTo)).get();
		System.out.println("max"+integer2);
	}

}
