package com.java8;

public class CountSingleCharacterOccureance {

	public static void main(String[] args)
	{

		   String str="india";

           long f =  str.chars().filter(n->(char)n=='n').count();
	       System.out.println(f);
	       
	       
	       
	    
	       
	}

}
