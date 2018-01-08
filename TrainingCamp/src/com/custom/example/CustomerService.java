package com.custom.example;

import com.custom.examples.exception.NameNotFoundException;

public class CustomerService {
	
	public Customer findByName(String name) throws NameNotFoundException {

        if ("".equals(name)) {
            throw new NameNotFoundException("Name is empty!");
        }

        return new Customer(name);

    }
	public static void main(String[] args){
		CustomerService obj=new CustomerService();
		try{
			Customer cus = obj.findByName("");
		}catch(NameNotFoundException e){
			e.printStackTrace();
		}
	}
}
