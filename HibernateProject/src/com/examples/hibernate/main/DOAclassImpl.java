package com.examples.hibernate.main;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.examples.hibernate.Employee;
import com.examples.hibernate.util.HibernateUtil;

public class DOAclassImpl implements DOAclass{
	 
	public void saveEmployee(String name, String city, int sal, int phone) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	 
	        try {
	            transaction = session.beginTransaction();
	            Employee employee = new Employee();
	            employee.setName(name);
	            employee.setSal(sal);
	            employee.setCity(city);
	            employee.setPhone(phone);
	            session.save(employee);
	            transaction.commit();
	            System.out.println("Records inserted sucessessfully");
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	 
	    }
	 
	    public void retriveEmployee()
	 
	    {
	 
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        try {
	            transaction = session.beginTransaction();
	            List employee = session.createQuery("from Employee").list();
	 
	            for (Iterator iterator = employee.iterator(); iterator.hasNext();) {
	                Employee employee1 = (Employee) iterator.next();
	                System.out.println(employee1.getName() + "  "
	                        + employee1.getCity() + "  " + employee1.getSal()
	                        + "   " + employee1.getPhone());
	            }
	            transaction.commit();
	 
	        } catch (HibernateException e) {
	 
	            transaction.rollback();
	 
	            e.printStackTrace();
	 
	        } finally {
	 
	            session.close();
	 
	        }
	    }
	 
	    public void deleteEmployee() {
	 
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        try {
	            transaction = session.beginTransaction();
	            String queryString = "from Employee where phone = :phone";
	            Query query = session.createQuery(queryString);
	            query.setInteger("phone", 893965);
	            Employee employee = (Employee) query.uniqueResult();
	            session.delete(employee);
	            transaction.commit();
	            System.out.println("Employee records deleted!");
	 
	        } catch (HibernateException e) {
	 
	            transaction.rollback();
	 
	            e.printStackTrace();
	 
	        } finally {
	 
	            session.close();
	 
	        }
	    }
	 
	    public void updateEmployee() {
	 
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = null;
	        try {
	            transaction = session.beginTransaction();
	            String queryString = "from Employee where sal = :sal";
	            Query query = session.createQuery(queryString);
	            query.setInteger("sal", 50000);
	            Employee EMPLOYEE = (Employee) query.uniqueResult();
	            EMPLOYEE.setSal(60000);
	            session.update(EMPLOYEE);
	            transaction.commit();
	            System.out.println("Employee records updated!");
	        } catch (HibernateException e) {
	 
	            transaction.rollback();
	 
	            e.printStackTrace();
	 
	        } finally {
	 
	            session.close();
	 
	        }
	    }

		

		

}
