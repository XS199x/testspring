package com.xufan.testspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext("AppConfig.class");
		hello2 hw = (hello2) context.getBean("helloWorld",hello2.class);
		hw.printHello();
	}

}
