package com.java8;

import java.util.HashMap;
import java.util.Map;

public class StringOccurance {

	public static void main(String[] args)
	{
	    String str="Jvaaprogramming";
	    str= str.toLowerCase();
	   
	    int totallen=str.length();//total
	    int aflen=str.replaceAll(str, "").length();
	    int coun=totallen-aflen;
	    System.out.println(coun);
	    
	    
	
	}

}
