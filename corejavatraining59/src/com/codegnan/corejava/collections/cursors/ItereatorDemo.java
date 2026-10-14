package com.codegnan.corejava.collections.cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class ItereatorDemo {
	
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Raj");
		names.add("Kumar");
		names.add("Rajan");
		names.add("Deepthi");
		
		// call iterator() on ArrayList to get an Iterator object
		
		Iterator<String> iterator = names.iterator();
		
		while(iterator.hasNext()) {
			
			String element = iterator.next();
			if (element.equals("Rajan")) {
				iterator.remove();
			}
	     }
		
		System.out.println(names);
		
		
		
	}

}
