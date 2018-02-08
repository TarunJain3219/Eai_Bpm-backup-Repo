package com.example.main;

import java.io.Serializable;

import javax.jws.WebService;

@WebService(targetNamespace = "http://main.example.com/", portName = "PersonPort", serviceName = "PersonService")
public class Person implements Serializable {
	private static final long serialVersinoUID=-5577579081118070434L;
	
	private String name;
	private int age;
	private int id;
	
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
