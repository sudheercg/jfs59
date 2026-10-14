package com.codegnan.corejava.java8features;

public class MyImpl implements MyInterface {

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		MyImpl impl = new MyImpl();
		
		impl.abstractMethod();
		
		//impl.defaultMethod();
		
		//MyInterface.staticMethod();
		
	}

	
}
