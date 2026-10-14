package com.codegnan.corejava.collections.queues;

import java.util.LinkedList;
import java.util.Queue;

public class BankQueueDemo {
	
	public static void main(String[] args) {
		
		
		//create  a queue using linkedList
		Queue<String> customers = new LinkedList<>();
		
		// 1. add customers 
		customers.offer("Ravi");
		customers.offer("Priya");
		customers.offer("Amit");
		customers.offer("Sneha");
		
		//2.diplay the customers waiting in the queue
		System.out.println("Waiting customers: "+ customers);
		
		//3. check the next customer
        System.out.println("Next Customer: "+ customers.peek());		
		
        //4. Serving the next customer
        System.out.println("Serving: "+ customers.poll());
        
        
        //5. display/count the waiting customers
        System.out.println("Customers waiting: "+ customers.size());
		
        //6. check queue status 
        System.out.println("Is Customer queue empty? "+ customers.isEmpty());
        
        // 7. display the next customer:
        System.out.println("Next customer: "+ customers.peek());
		
	}

}
