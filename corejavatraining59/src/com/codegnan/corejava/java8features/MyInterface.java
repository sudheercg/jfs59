package com.codegnan.corejava.java8features;

public interface MyInterface {
	
	public void abstractMethod();
	
	public static void staticMethod() {
		System.out.println("Static method");
		
	}
	
	/*
	public void method() {
		//
	}
	*/
	
	default void defaultMethod() {
		
		System.out.println("default method");
	}

}
