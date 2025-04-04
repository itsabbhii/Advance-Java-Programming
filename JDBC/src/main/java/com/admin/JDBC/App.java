package com.admin.JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

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
        
        String insert = "insert into student (id, name, city) values (?, ?, ?)";
        String delete = "delete from student where id = ?";
        String update = "update student set city =? where id = ?";
        String read = "Select * from student";
        
        
//        int result = template.update(insert, 4, "Adarsh", "Delhi");
        
//        System.out.println( result + " records inserted!!!" );
        
        List<Student> students = template.query(read, new RowMapper<Student>() {
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setCity(rs.getString("city"));
                return student;
            }
        });
        
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
