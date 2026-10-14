package com.codegnan.corejava.collections.set;

public class Product {
	
	int productId; 
	String productName;
	
	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	} 
	
	public String  toString() {
		return productId+" "+productName;
	}
	

}
