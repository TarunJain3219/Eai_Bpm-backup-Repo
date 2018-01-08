package com.example.orchard.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.orchard.util.HibernateUtil;



public class Main {
	
	public static void main(String args[]) {
		CampusMind campusMind=new CampusMind();
		//CampusMind campusMind1=new CampusMind();
		
		campusMind.setMid_campus_mind("M1043219");
		campusMind.setName_campus_mind("Tarun Jain");
		campusMind.setTrack("EAI");
		/*campusMind1.setMid_campus_mind("M1043218");
		campusMind1.setName_campus_mind("Ashish");
		campusMind1.setTrack("EAI");*/
		
		
		
		Lead lead=new Lead();
		lead.setName_lead("PREM");
		lead.setMid_lead("M104321");
		
		lead.setCampusMind(campusMind);
		
		
	Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = null;
	/*session.beginTransaction();
	
	session.save(lead);
	session.beginTransaction().commit(); 
	session.close();
 */
       try {
           transaction = session.beginTransaction();
           
           session.save(lead);
           transaction.commit();
           System.out.println("Records inserted sucessessfully");
       } catch (HibernateException e) {
           transaction.rollback();
           e.printStackTrace();
       } finally {
           session.close();
       }
        
	}
	

}
