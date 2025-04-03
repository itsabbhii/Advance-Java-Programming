package com.admin.SpringAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Qualcomm implements MobileProcessor{
	public void process() {
		System.out.println("Snapdragon 8 elite");
	}
}
