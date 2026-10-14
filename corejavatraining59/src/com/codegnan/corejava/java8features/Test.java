package com.codegnan.corejava.java8features;

public class Test {
	
	public static void main(String[] args) {
		//to implement the functional interface using lambda expression	
		DemoInterface d = () -> System.out.println("Hello World!");	
		/*
		d.displayText();     
		
		DemoInterface d1 = ()-> {
								System.out.println("Statement1");
		                        System.out.println("Statement2");
	                        	};
		d1.displayText();      
		*/
		
		DemoInterface02 d2 = (a,b)->System.out.println("Sum: "+(a+b));
		
		d2.add(100, 200);
		
		
		
		//public String concatStrings(String string1,String string2);
		StringConcatenator s = (a,b)->  a+b;
		
		String result =s.concatStrings("Core ", "Java");
		System.out.println("Result of concatenation: "+ result);
		                        
	}

}

/*

Create a Functional interface
create a abstract method to concatenate two string. 
the method must have 2 Strings as input. 
OUtput: 
	firstString+SecondString'; 




Create a functional interface with a abstract method 
int addNumbers(int first,int second);



*/