package com.example.main;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface PersonService {
	
	@WebMethod
	public boolean addPerson(Person p);
	
	@WebMethod
	public boolean DeletePerson(int id);
	
	@WebMethod
	public Person getPerson(int id);
	
	@WebMethod
	public Person[] getAllPerson();
	

}
