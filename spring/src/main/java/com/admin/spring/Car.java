package com.admin.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("car") // Non capitalize and non qualified reference is created 
public class Car implements Vehicle {
	@Autowired // access objects of a class in another class
	private Tyre tyre;
	
	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public void drive() {
		tyre.setBrand("MRF");
		System.out.println("Car Running with "+tyre+" Tyre\nBrooooooooooom!!");
	}
}
