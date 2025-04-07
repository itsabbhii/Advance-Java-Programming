package com.admin.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class User {
	private String uname;
	private String tech;
	private int uid;
	
	@Autowired
	private Laptop laptop;
	
	@Override
	public String toString() {
		return "in string";
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public void show() {
		System.out.println("In show");
		laptop.compile();
	}
	public User() {
		super();
		System.out.println("Object created");
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
}
