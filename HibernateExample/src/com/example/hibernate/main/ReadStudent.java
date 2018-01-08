package com.example.hibernate.main;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.hiberante.model.Student;
import com.example.hibernate.util.HibernateUtil;

public class ReadStudent {

 /**
  * @param args
  */
 public static void main(String[] args) 
 {
  //Create session factory object
  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
  //getting session object from session factory
  Session session = sessionFactory.openSession();
  //getting transaction object from session object
  session.beginTransaction();
  Query query = session.createQuery("from Student");
  List<Student> students = query.list();
  for(Student student : students)
  {
System.out.println("Roll Number: "+student.getRollnumber()+", Student Name: "+student.getStudentName()+", Course: "+student.getCourse());
  }
  session.getTransaction().commit();
  sessionFactory.close();
 }
}