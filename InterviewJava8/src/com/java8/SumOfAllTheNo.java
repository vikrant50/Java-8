package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfAllTheNo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Integer> mylist=Arrays.asList(1,3,43,45,32,2);	
		
        Optional<Integer> sum= mylist.stream().reduce((a,b)->a+b);
        System.out.println(sum.get());
        
        Optional<Integer> reduce = mylist.stream().reduce((a,b)->a*b);
        System.out.println(reduce);
        
       

	}

}
