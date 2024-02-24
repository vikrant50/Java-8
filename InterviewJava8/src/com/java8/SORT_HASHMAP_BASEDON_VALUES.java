package com.java8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SORT_HASHMAP_BASEDON_VALUES
 {
	public static void main(String[] args) 
	{
		HashMap<String, Integer> map=new HashMap<>();
		map.put("amit", 3);
		map.put("mayank", 10);
		map.put("rahul", 2);
		map.put("deep", 6);
		
		//output :- 2 3 6 10
		
		//let me sort based on values
	    LinkedHashMap<String, Integer> sm=	map.entrySet().stream().sorted((e1,e2)->
	    {
		return e1.getValue() - e2.getValue();
				}).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		System.out.println(sm);
		
	}

}
