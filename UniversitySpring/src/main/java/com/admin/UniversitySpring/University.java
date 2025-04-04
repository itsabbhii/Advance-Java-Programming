package com.admin.UniversitySpring;

import org.springframework.stereotype.Component;

@Component("uni")
public class University {
	private String dept;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "University [dept=" + dept + "]";
	}

	public University(String dept) {
		super();
		this.dept = dept;
	}
	
}
