package com.admin.spring;

public class Tyre {
	public Tyre(String brand) {
		super();
		this.brand = brand;
	}

	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}

}
