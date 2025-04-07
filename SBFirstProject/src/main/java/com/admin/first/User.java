package com.admin.first;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String uname;
	private String tech;
	private int uid;
	
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
		// TODO Auto-generated method stub
		System.out.println("In show");
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Object created");
	}
}
