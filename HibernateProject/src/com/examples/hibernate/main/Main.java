package com.examples.hibernate.main;

import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.examples.hibernate.Employee;
import com.examples.hibernate.util.HibernateUtil;
 
public class Main {
    public static void main(String[] args) {
    	DOAclassImpl m= new DOAclassImpl();
    	
        m.saveEmployee("Mukesh12", "jaipur", 100000, 893965);
        m.saveEmployee("Ravi12", "bangalore", 50000, 996654);
        m.saveEmployee("Amit13", "delhi", 45000, 93445);
        m.retriveEmployee();
        m.deleteEmployee();
        m.updateEmployee();
    }
 
   
}