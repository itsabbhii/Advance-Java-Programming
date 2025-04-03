package com.admin.SpringAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	@Autowired
	@Qualifier("qualcomm")
	private MobileProcessor cpu ;
	
	public MobileProcessor getCpu() {
		return cpu;
	}


	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}


	public void config() {
		System.out.println("S25 Ultra");
		System.out.println("16 GB RAM || 256 GB UFS 3.2 Storage");
		System.out.println("50 + 50 + 50 MP Camera");
		System.out.println("120x Zoom");
		cpu.process();
	}
}
