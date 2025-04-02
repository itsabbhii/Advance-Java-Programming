package com.admin.spring;

import org.springframework.stereotype.Component;

@Component("car") // Non capitalize and non qualified reference is created 
public class Car implements Vehicle {
	private Tyre tyre;
	
	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public void drive() {
		System.out.println("Car Running with "+tyre+" Tyre\nBrooooooooooom!!");
	}
}
