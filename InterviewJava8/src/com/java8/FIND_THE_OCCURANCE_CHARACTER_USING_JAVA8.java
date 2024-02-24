package com.java8;

import java.util.Set;
import java.util.TreeSet;

public class FIND_THE_OCCURANCE_CHARACTER_USING_JAVA8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="I AM A JAVA DEVELOPERaajdfudfujasbcujasudve";
		countOccurance(str);
			
	    }
		static void countOccurance(String input)
		{
			char[] strArray=input.toCharArray();
			
			Set<Character> charSet=new TreeSet<>();
			
			for(char c:strArray)
			{
				charSet.add(c);
			}
			//charSet.forEach(System.out::println);
			for(char c:charSet)
			{
				long count = input.chars().filter(ch->ch==c).count();
				System.out.println("Occurance of "+c+" is "+count);
			}
		}
	}