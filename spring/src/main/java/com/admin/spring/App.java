package com.admin.spring;
import org.springframework.context.*;
import org.springframework.context.support.*;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Vehicle c = (Vehicle) context.getBean("car");
    	c.drive();
    	Vehicle b = new Bike();
    	b.drive();
    }
}
