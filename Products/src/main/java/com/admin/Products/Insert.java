package com.admin.Products;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Insert {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/admin/Products/configure.xml");
		
		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		
		String query = "insert into product(product_name, product_quantity) values(?, ?)";
		
		int result = template.update(query, "Laptop", 4);
		
		System.out.println(result + " rows inserted");
		
	}
}
