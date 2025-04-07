package com.admin.first;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	private String brand;
	private int lid;
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", lid=" + lid + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public void compile() {
		System.out.println("In Compile");
	}
}
