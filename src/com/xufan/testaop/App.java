package com.xufan.testaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonBean pb = (PersonBean) context.getBean("customerServiceProxy");
		pb.print();
	}

}
