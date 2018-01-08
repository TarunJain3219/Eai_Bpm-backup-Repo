package com.example.orchardprogram.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.orchardprogram.util.HibernateUtil;

public class Main {
	public static void main(String args[]){
		DOAclassImpl doaclassImpl=new DOAclassImpl();
		doaclassImpl.OneToOneMapping();
		doaclassImpl.ManyToOneMapping();
		doaclassImpl.OnetoManyMapping();
		doaclassImpl.retrieve("M105432");
		
	}

}
