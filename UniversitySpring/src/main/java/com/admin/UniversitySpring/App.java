package com.admin.UniversitySpring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");    	
    	List<String> l = new ArrayList<String>();
    	University u = (University) context.getBean("uni");
    	l.add(u.getDept());
        
        System.out.println( "Department List!!" );
        
        for(String s: l) {
        	System.out.println(s);
        }
    }
}
