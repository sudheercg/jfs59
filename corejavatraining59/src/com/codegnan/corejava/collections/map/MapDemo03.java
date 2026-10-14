package com.codegnan.corejava.collections.map;


import java.util.Map;
import java.util.TreeMap;

public class MapDemo03 {

	public static void main(String[] args) {

		Student st1 = new Student(100, "Raj", 21); // A
		Student st2 = new Student(101, "Sai", 22); // B
		Student st3 = new Student(103, "Khan", 20); // A
		Student st4 = new Student(104, "Suraj", 30); // A

		TreeMap<Character, Student> studentMap = new TreeMap<>();

		studentMap.put('F', st1);
		studentMap.put('A', st2);
		studentMap.put('B', st3);
		studentMap.put('C', st3);
		studentMap.put('D', st3);
		studentMap.put('A', st4);

		for (Map.Entry<Character, Student> entry : studentMap.entrySet()) {
			System.out.println(entry.getKey() + "|" + entry.getValue().getName());
		}
	}

}
