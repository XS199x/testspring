package com.xufan.testsendmail;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	@SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	ApplicationContext context = 
             new ClassPathXmlApplicationContext("Spring-Mail.xml");
    	
    	MailMail mm = (MailMail) context.getBean("mailMail");
    	for(int i=0;i<100;i++) {
    		mm.sendMail("ÀÏÍõ", "Testing only \n\n Hello Spring Email Sender");
    	}
    }
}
