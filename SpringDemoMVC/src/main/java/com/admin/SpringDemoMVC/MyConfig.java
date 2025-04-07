package com.admin.SpringDemoMVC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@ComponentScan({"com.admin"})
public class MyConfig {
	@Bean
	public InternalResourceViewResolver ViewResolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/"); //Folder name
		vr.setSuffix(".jsp"); // extensions
		return vr;
	}
}
