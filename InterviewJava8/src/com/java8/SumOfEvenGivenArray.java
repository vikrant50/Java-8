package com.java8;

import java.util.Arrays;

public class SumOfEvenGivenArray {

	public static void main(String[] args) 
	{
		int arr[]= {1,2,4,6,54,23};
		
		//i need to create for stream for this given no
		int sum= Arrays.stream(arr).filter(n->n%2==0).sum();
		
		Arrays.stream(arr).filter(n->n%2==0).sum();
		
		System.out.println("sum of even no is :"+sum);
		

	}

}
