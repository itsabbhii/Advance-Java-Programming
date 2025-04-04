package com.admin.Products;

public class ProductsClass {
	private String product_name;
	private int product_quantity;
	private int id;
	
	public ProductsClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductsClass(String product_name, int product_quantity, int id) {
		super();
		this.product_name = product_name;
		this.product_quantity = product_quantity;
		this.id = id;
	}
	@Override
	public String toString() {
		return "ProductsClass [product_name=" + product_name + ", product_quantity=" + product_quantity + ", id=" + id
				+ "]";
	}
	
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getProduct_quantity() {
		return product_quantity;
	}
	public void setProduct_quantity(int product_quantity) {
		this.product_quantity = product_quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
