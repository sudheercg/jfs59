package com.codegnan.corejava.java8features;

public class Demo {
	
	// static method
	public static void doSomething() {
		System.out.println("Doing something");
	}
	
	//instance method
	public void doSomethingElse(){
		System.out.println("Doing something else");
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		d.doSomethingElse();
		
		doSomething(); 
		Demo.doSomething();
		
		MyInterface.staticMethod();
	}

}
