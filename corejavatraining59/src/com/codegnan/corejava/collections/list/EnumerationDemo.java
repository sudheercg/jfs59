package com.codegnan.corejava.collections.list;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {

		Vector<String> v = new Vector<>();

		v.add("Hyderabad");
		v.add("Vijayawada");
		v.add("Pune");
		v.add("Chennai");
		
		//Using Enumeration to access the elements
		Enumeration<String> en= v.elements();
		
		//hasMoreElements() checks if an elements exist in Vector or not
		// it returns a boolean value true if elements exists
		// it returns false if no element exists. 
	    while(en.hasMoreElements()) {
	    	
	    	System.out.println(en.nextElement());
	    }
	    
	    
	    
	    
	
		
		
	}

}
