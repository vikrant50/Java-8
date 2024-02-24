package com.java8.awesome;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMethodDemo6 {

	public static void main(String[] args)
	{
		List<Integer> list=Arrays.asList(10,20,30,40,50,60,70,80,31,90,100);

		//skip()
		List<Integer> skip=list.stream().skip(5).collect(Collectors.toList());
	    System.out.println("after skipped 5 element "+skip);
	    
	    //allMatch():- Return whether all element of the stream match the provided predicate 
	   boolean allmatch=list.stream().allMatch(n->n%2==0);
	   System.out.println("all elememt should be match : "+allmatch);
	   
	   //anymatch :-opposte of allmatch
	   boolean anymatch=list.stream().anyMatch(n->n%2!=0);
	   System.out.println("any one match odd no : "+anymatch);
	   
	   //findFirst():-Return an optional class ..
	   Optional<Integer> first= list.stream().findFirst();
	  System.out.println(first.get());
	  
	  //count()
	   System.out.println(list.stream().count());
	  System.out.println(list.stream().filter(n->n%2==0).count());

	  //max and min()
	  //using lamda expression
	  Integer max1=list.stream().max((a,b)->a.compareTo(b)).get();
	  System.out.println("using lamda expern max element :"+max1);
	  Integer min1=list.stream().min((a,b)->a.compareTo(b)).get();
	  System.out.println("using lamda expern min element :"+min1);
	  
	  //using method refenrce 
	  Integer max2=list.stream().max(Integer::compare).get();
	  System.out.println("using method refence:"+max1);
	  Integer min2=list.stream().min(Integer::compare).get();
	  System.out.println("using method reference min element :"+min1);
	  
	  
	
	}

}
