package com.admin.jpah2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {
	@Id
	private int aid;
	private String aname;
	private String alang;
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAlang() {
		return alang;
	}
	public void setAlang(String alang) {
		this.alang = alang;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	@Override
	public String toString() {
		return "Alien [aname=" + aname + ", alang=" + alang + ", aid=" + aid + "]";
	}
	

	
}
