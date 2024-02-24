package com.java8.awesome;
@FunctionalInterface
interface Calculator
{

	int addition(int a,int b);
} 
public class Demo2 
{

	public static void main(String[] args)
	{
		Calculator cal= (a,b) -> a+b;

		System.out.println(cal.addition(21, 30));
		System.out.println(cal.addition(23, 30));
		System.out.println(cal.addition(22, 30));
		System.out.println(cal.addition(216, 30));
		

	}
	
	

}
