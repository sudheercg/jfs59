package com.codegnan.corejava.collections.set;

import java.util.HashSet;

public class SetDemo02 {
	
	public static void main(String[] args) {
		
		HashSet<Product> productSet = new HashSet<>();
		
		//adding products into productSet
		productSet.add(new Product(101,"Pen"));
		productSet.add(new Product(102,"Bulb"));
		productSet.add(new Product(103,"Torch"));
		productSet.add(new Product(105,"Mouse"));
		productSet.add(new Product(101,"Pen"));
		//System.out.println(productSet);
		
		for(Product product : productSet) {
			System.out.println(product);
		}

		
	}

}
