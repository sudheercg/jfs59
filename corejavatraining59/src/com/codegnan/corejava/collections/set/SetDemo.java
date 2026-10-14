package com.codegnan.corejava.collections.set;

import java.util.Collections;
import java.util.TreeSet;

public class SetDemo {
	
	public static void main(String[] args) {
		
		//HashSet<String> set = new HashSet<>();
		TreeSet<String> set = new TreeSet<>();
		set.add("Hyderabad");
		set.add("Secunderabad");
		set.add("Vijayawada");
		set.add("Vizag");
		//set.add(null);
		set.add("Vizag");
		
		System.out.println(set);
		
		
		
	//	Collections.sort(set);
		
		
		
	}

}
