package com.codegnan.corejava.collections.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Demo02 {
	
	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<>();
		
		productList.add(new Product(101,"Book2",40.00));
		productList.add(new Product(102,"Book1",500.24));
		productList.add(new Product(103,"Book6",300.50));
		productList.add(new Product(100,"Book0",10.00));
		
		//Collections.sort(productList);
		//Collections.sort(productList,new IdComparator());
		
		Collections.sort(productList,new NameComparator());
		
		for(Product product:productList) {
			System.out.println(product);
			
		}



	}

}
