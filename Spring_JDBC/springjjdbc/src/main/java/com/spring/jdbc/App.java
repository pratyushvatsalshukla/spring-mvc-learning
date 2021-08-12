package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program Started !!!!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml") ;
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class) ;
        
        String query = "insert into student(id, name, city) values(?, ?, ?)" ;
        
        // Fire QUery
        int result = template.update(query, 2, "Neeraj", "Basti") ;
        System.out.println("Number of record inserted..." + result);
    }
}
