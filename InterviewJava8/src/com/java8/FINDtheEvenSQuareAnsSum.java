package com.java8;

import java.util.Arrays;
import java.util.List;

/*
 input:- [1,2,3,4,5]
 output:- 2*2 + 4*4=20
 */
public class FINDtheEvenSQuareAnsSum {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        List<Integer> list=Arrays.asList(1,2,3,4,5);
        int sum= list.stream().filter(n->n%2==0).mapToInt(n->n*n).sum();
	    System.out.println(sum);
	}

}
