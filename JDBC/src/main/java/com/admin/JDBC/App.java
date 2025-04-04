package com.admin.JDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/admin/JDBC/config.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
        
        String query = "insert into student (id, name, city) values (?, ?, ?)";
        
        int result = template.update(query, 4, "Adarsh", "Delhi");
        
        System.out.println( result + " records inserted!!!" );
    }
}
