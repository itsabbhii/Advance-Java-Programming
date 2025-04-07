package com.admin.SpringDemoMVC;

import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class MyConfig {
	public InternalResourceViewResolver ViewResolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/"); //Folder name
		vr.setSuffix(".jsp"); // extensions
		return vr;
	}
}
