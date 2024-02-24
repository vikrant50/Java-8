package com.java8.awesome;

import java.util.Arrays;
import java.util.List;
/*
 The Stream API is a powerful feture introduced in java8 that provides a functional approch to 
 processing collection of data.
-> Stream API is a newly added feature to the collections API in java 8.
-> A stream represent a sequence of element and support different operation (Filter ,Sort, Map and collect ) from a collection
-> we can combine these operation to form a pipline to query the data .
 */
public class StreamDemo1 
{

	public static void main(String[] args) 
	{
		List<Integer> numbers=Arrays.asList(1,23,4,5,564,2,3,3);
		
		//sum even 
		int sum=numbers.stream().filter(n->n%2==0).mapToInt(n->n).sum();
		System.out.println(sum);
		
		//sum odd 
		int odd=numbers.stream().filter(n->n%2!=0).mapToInt(n->n).sum();
		System.out.println(odd);
		
		//without stream() ...sum even
		
		int summ=0;
		for(Integer i: numbers)
		{
			if(i%2==0)
			{
				summ=summ+i;
			}
			
		}
		System.out.println("without stream "+summ);
		
	}

}
