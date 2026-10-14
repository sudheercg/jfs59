package com.codegnan.corejava.collections.list;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		//Create a stack object
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(30);
		stack.push(40);
		//stack.push("Apple");// Not allowed
		stack.push(50);
		
		//System.out.println(stack);
		
		//Stack@9838383
		
		System.out.println("Before Pop");
		for(Integer element:stack) {
			System.out.println(element);
		}
		
		System.out.println();
		System.out.println("Popped element: "+stack.pop());
		System.out.println();
		
		System.out.println("After Pop");
		for(Integer element:stack) {
			System.out.println(element);
		}
		
		System.out.println("Peeked element: "+stack.peek());//returns the top element of the stack
		
		
	}

}
