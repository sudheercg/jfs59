package com.codegnan.corejava.java8features.predefinedfi;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
	
	public static void main(String[] args) {
		
		BiPredicate<Integer,Integer> checkSum
		= (n1,n2)-> (n1+n2)>100;
		
		System.out.println(checkSum.test(40,40));
		
		
		//A student is eligible for admission if
		//age is atleast 18, and percentage is atleast 60
		
		BiPredicate<Integer,Integer> isEligible=
				(age,percentage)-> age>=18 && percentage>=60;
				
	   System.out.println(isEligible.test(19, 65));
		
		
	}

}
