package com.demo.model;

public class Product {

	String productname;
	String productprice;
	
	
	public Product(String productname, String productprice) {
		super();
		this.productname = productname;
		this.productprice = productprice;
	}
	public Product() {
		super();
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductprice() {
		return productprice;
	}
	public void setProductprice(String productprice) {
		this.productprice = productprice;
	}
	@Override
	public String toString() {
		return "Product [productname=" + productname + ", productprice=" + productprice + "]";
	}
}
