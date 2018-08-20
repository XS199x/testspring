package com.xufan.testaop;

import org.springframework.stereotype.Component;

@Component("PPP")
public class PersonBean {
	private String name = "уехЩ";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println(name);
	}
}
