package com.xufan.testjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xufan.testjdbc.dao.CustomerDAO;
import com.xufan.testjdbc.model.Customer;

public class App {
	@SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	ApplicationContext context = 
    		new ClassPathXmlApplicationContext("applicationContext.xml");
    	 
        CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
        Customer customer = new Customer("2", "xufan",27);
        customerDAO.insert(customer);
    	
        Customer customer1 = customerDAO.findByCustomerId("1");
        System.out.println(customer1);
        
    }
}
