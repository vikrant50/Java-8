package com.java8.awesome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo4Map {

	public static void main(String[] args) {
		// Map and flatMap diff
		//if we have list of data the map 
		//if we have list of list data then we should go for flat map
		
		List<String> word = Arrays.asList("apple","banana","fruits","orange");

		List<Integer> collect=word.stream().map(n->n.length()).collect(Collectors.toList());
		System.out.println("before :- "+word);
		System.out.println("after :- "+collect);
		
		//flatMap
		//input:- [[1, 2, 3], [1, 67, 3], [13, 22, 32]]
		//output:- [1,2,3,1,67,3,13,22,32]
		List<List<Integer>> numList=new ArrayList<>();
		numList.add(Arrays.asList(1,2,3));
		numList.add(Arrays.asList(13,62,43));
		numList.add(Arrays.asList(19,23,34));
		System.out.println(numList);
		List<Integer> fm=numList.stream().flatMap(list->list.stream()).collect(Collectors.toList());
		System.out.println("converted single list :" +fm);
	}

}
