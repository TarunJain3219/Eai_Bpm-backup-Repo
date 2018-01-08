package com.examples.hibernate;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")


public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
    
	@Id
	 @Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	 @Column(name="NAME")
    private String name;
	 
	 @Column(name="SAL")
    private int sal;
	 
	 @Column(name="CITY")
    private String city;
	 
	 @Column(name="PHONE")
    private int phone;
	 
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}

}
