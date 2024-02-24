package com.java8;

import java.util.Arrays;

public class SumEven 
{
  public static void main(String[] args)
  {
	  int[] number= {2,4,5,67,8,9,9,5};
		int sum=Arrays.stream(number).filter(n->n%2==0).sum();
		System.out.println(sum);
		
		
		
		
		
		
		
		int arr[]= {2,3,4,3,454,3};
		
		int sum1=Arrays.stream(arr).filter(n->n%2==0).sum();
		System.out.println(sum1);
  }
	

}
