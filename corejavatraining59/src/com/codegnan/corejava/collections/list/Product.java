package com.codegnan.corejava.collections.list;

public class Product implements Comparable<Product>{
	
	int productId; 
	String productName;
	double price; 
	
	public Product(int productId, String productName, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price=price; 
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
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String  toString() {
		return productId+" "+productName+" "+price;
	}

	/*
	@Override
	 public int compareTo(Product o) {
		 return Integer.compare(this.productId, o.productId);
	 }
	 */
	
	/*
	@Override
	public int compareTo(Product p) {
		return this.productName.compareTo(p.productName);
	}
	*/
	
	public int compareTo(Product p) {
		return Double.compare(this.price, p.price);
	}
	
	

}
