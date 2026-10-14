package com.codegnan.corejava.collections.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Product>{
	
	public int compare(Product p1, Product p2) {
		return p1.getProductName().compareTo(p2.getProductName());
	}

}
