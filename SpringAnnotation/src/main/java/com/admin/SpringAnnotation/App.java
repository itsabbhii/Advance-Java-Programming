package com.admin.SpringAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */



public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
    	Samsung s25 = factory.getBean(Samsung.class);
    	s25.config();
    }
}
