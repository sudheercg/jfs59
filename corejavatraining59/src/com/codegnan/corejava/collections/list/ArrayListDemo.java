package com.codegnan.corejava.collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> countriesList = new ArrayList<String>();
		
		countriesList.add("India");
		countriesList.add("Japan");
		countriesList.add("US");
		countriesList.add("Australia");
		
		System.out.println("Before calling sort()");
		for(String country:countriesList) {
			System.out.println(country);
		}
		
		//sort
		System.out.println();
		Collections.sort(countriesList);
		
		System.out.println("After calling sort()");
		for(String country:countriesList) {
			System.out.println(country);
		}
		
		ArrayList<Integer> numList = new ArrayList<>();
		numList.add(10);
		numList.add(5);
		numList.add(1);
		numList.add(79);
		
		
		for(Integer num:numList) {
			System.out.println(num);
		}
		System.out.println();
		
		Collections.sort(numList);
		for(Integer num:numList) {
			System.out.println(num);
		}
		
	}
	
}
