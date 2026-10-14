package com.codegnan.corejava.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//101 Suresh
		
		HashMap<Integer,String> studentMap = new HashMap<>();
		
		
		
		studentMap.put(101,"Ram");
		studentMap.put(102, "Khan");
		studentMap.put(103, "Raj");
		studentMap.put(104, "John");
		
		System.out.println(studentMap);
		
		System.out.println(studentMap.get(102));
		
		System.out.println(studentMap.keySet());
		System.out.println(studentMap.values());
		
		
	     for(Map.Entry<Integer, String> entry: studentMap.entrySet()) {
	    	     
	    	     System.out.println(entry.getKey() +"|"+ entry.getValue());
	    	 
	     }
		
		
	}
	
	
}
