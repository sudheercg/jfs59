package com.codegnan.corejava.collections.queues;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	
	
	public static void main(String[] args) {
		
		
		PriorityQueue<Integer> pq = 
				new PriorityQueue<>();
		
		//add elements using offer()
		
		pq.offer(40);
		pq.offer(10);
		pq.offer(30);
		pq.offer(20);
		pq.offer(50);
		pq.offer(10);
		
		System.out.println(pq);
	
		// peek()
		System.out.println(pq.peek());
		
		//poll()
		System.out.println(pq.poll());
		System.out.println(pq);
		
		
		
	}

}
