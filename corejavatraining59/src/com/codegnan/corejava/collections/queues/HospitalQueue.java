package com.codegnan.corejava.collections.queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class HospitalQueue {

	public static void main(String[] args) {

		Deque<String> patients = new ArrayDeque<>();

		// add normal patients
		patients.addLast("Ravi");
		patients.addLast("Priya");
		patients.addLast("Amit");

		System.out.println("Normal Patients: " + patients);

		// add emergency patient
		patients.addFirst("Kiran");

		// addanother normal patient
		patients.addLast("Sneha");

		// display the patients queue;
		System.out.println("patients Queue: " + patients);
		
		//view next patient
		System.out.println("Next Patient: "+ patients.peekFirst());
		
		// Serve patients:
		System.out.println("Patient served: "+patients.pollFirst());
		
		//cancel the appoint ment of the last patient
		System.out.println("Appointment is cancelled: "+ patients.pollLast());
		
		
		
		
		

	}

}
