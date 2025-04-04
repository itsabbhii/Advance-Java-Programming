package com.admin.Products;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Fetch {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/admin/Products/configure.xml");
		
		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		
		String read = "select * from product";
		List<ProductsClass> products = template.query(read, new RowMapper<ProductsClass>() {
            public ProductsClass mapRow(ResultSet rs, int rowNum) throws SQLException {
                ProductsClass product= new ProductsClass();
                product.setId(rs.getInt("id"));
                product.setProduct_name(rs.getString("product_name"));
                product.setProduct_quantity(rs.getInt("product_quantity"));
                return product;
            }
        });
        
        for (ProductsClass p : products) {
            System.out.println(p);
        }
	}
}
