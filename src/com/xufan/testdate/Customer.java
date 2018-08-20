package com.xufan.testdate;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public void printDate() {
		 System.out.println("aaaa");
	}
}
