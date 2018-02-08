package com.example.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.jws.WebService;

@WebService(targetNamespace = "http://main.example.com/", portName = "PersonServiceImplPort", serviceName = "PersonServiceImplService")
public class PersonServiceImpl implements PersonService {

	private static Map<Integer,Person> person= new HashMap<Integer,Person>();	
	@Override
	public boolean addPerson(Person p) {
		// TODO Auto-generated method stub
		if(person.get(p.getId())!=null)
			return false;
		person.put(p.getId(), p);
		return true;
	}

	@Override
	public boolean DeletePerson(int id) {
		// TODO Auto-generated method stub
		if(person.get(id)==null) return false;
		person.remove(id);
		
		return true;
	}

	@Override
	public Person getPerson(int id) {
		// TODO Auto-generated method stub
		
		
		return person.get(id);
	}

	@Override
	public Person[] getAllPerson() {
		// TODO Auto-generated method stub
		
		Set<Integer> ids=person.keySet();
		Person[] p=new Person[ids.size()];
		int i=0;
		for(Integer id: ids){
			p[i]=person.get(id);
			i++;
		}
		return p;
	}

}
