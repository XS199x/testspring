package com.xufan.testjdbc.model;

public class Customer 
{
	String custId;
	String name;
	int age;
	public Customer(String int1, String string, int int2) {
		this.custId = int1;
		this.name = string;
		this.age = int2;
	}
	//getter and setter methods
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
