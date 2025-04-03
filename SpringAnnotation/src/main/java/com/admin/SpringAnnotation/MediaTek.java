package com.admin.SpringAnnotation;

import org.springframework.stereotype.Component;

@Component("mediatek")
public class MediaTek implements MobileProcessor{
	public void process() {
		System.out.println("Dimensity 9000");
	}
}
