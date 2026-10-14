package com.codegnan.corejava.java8features.predefinedfi;

import java.util.function.Predicate;

public class PredicateDemo {
	
	public static void main(String[] args) {
		
		// boolean test(T t)
		
		Predicate<Integer> isEven =
				n->n%2==0;
				
       System.out.println(isEven.test(33));
       
       Predicate<Integer> isPassed
       = marks-> marks>=40;
       
       System.out.println(isPassed.test(35));//fase
       System.out.println(isPassed.test(55));//true
       
		
	}

}
