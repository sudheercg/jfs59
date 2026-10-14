package com.codegnan.corejava.collections.comparator;

import java.util.Comparator;

public class IdComparator implements Comparator<Product>{
	
	@Override
	public int compare(Product p1, Product p2) {
		return Integer.compare(p1.productId, p2.productId);
	}

}


