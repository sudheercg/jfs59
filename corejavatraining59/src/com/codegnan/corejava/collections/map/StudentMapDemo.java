package com.codegnan.corejava.collections.map;

import java.util.HashMap;
import java.util.Map;

//Demonstration of a HashMap with Student object as 
//value 
public class StudentMapDemo {
	
	public static void main(String[] args) {
		
		
		Student st1 = new Student(100,"Raj", 21); //A
		Student st2 = new Student(101,"Sai", 22);  //B
		Student st3 = new Student(103,"Khan", 20); //A
		Student st4 = new Student(104,"Suraj", 30); //A

		
		HashMap<Character,Student> studentMap = new HashMap<>();
		
		studentMap.put('A', st1);
		studentMap.put('B', st2);
		studentMap.put('C',st3);
		studentMap.put('D',st3);
		studentMap.put('E',st3);
		studentMap.put('F',st4);
		
		/*
		studentMap.put('D',st3);
		studentMap.put('E',st3);
		studentMap.put('F',st4);
		
		*/
		
		for(Map.Entry<Character,Student> entry: studentMap.entrySet()) {
			
			System.out.println(entry.getKey()+"|"+ entry.getValue().getName());
		}
		
		
		
		

		
		
	}
	
	

}
