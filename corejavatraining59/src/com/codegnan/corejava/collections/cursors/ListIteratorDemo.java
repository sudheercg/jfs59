package com.codegnan.corejava.collections.cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Raj");
		names.add("Kumar");
		names.add("Rajan");
		names.add("Deepthi");
		
		//listIterator()
	      ListIterator<String> li = names.listIterator();
	      
			
			  while(li.hasNext()) {
			  
			  System.out.println(li.next());
			  
			  }
			 
		System.out.println("**Forward traversal completed.. backward traversal begins");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		
		
		
		
		
		
		
	}

}
