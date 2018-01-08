package com.example.orchardprogram.main;

import java.util.List;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.orchardprogram.util.HibernateUtil;

public class DOAclassImpl implements DOAinterface {

	@Override
	public void OneToOneMapping() {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction tnx=null;
		try{
			tnx=session.beginTransaction();
			Lead lead=new Lead("M105432", "PREM","EAI");
			Lead lead1=new Lead("M105431", "AVANISH","SDET");
			Lead lead2=new Lead("M105430", "VIVEK","JAVA");
			Lead lead3=new Lead("M105429", "MUKESH","AEM");
			
			
			CampusMind campusMind=new CampusMind("M1043217", "ROHAN", lead1);
			CampusMind campusMind1=new CampusMind("M1043216", "ROHIT", lead);
			CampusMind campusMind2=new CampusMind("M1043219", "TARUN", lead2);
			CampusMind campusMind3=new CampusMind("M1043212", "NAVEEN", lead);
			CampusMind campusMind4=new CampusMind("M1043211", "NAVNEET", lead3);
			CampusMind campusMind5=new CampusMind("M1043210", "UDIT", lead);
			CampusMind campusMind6=new CampusMind("M1043209", "ANKUSH", lead);
			
			
			

			
			session.save(campusMind );
			session.save(campusMind1);
			session.save(campusMind2);
			session.save(campusMind3);
			session.save(campusMind4);
			session.save(campusMind5);
			session.save(campusMind6);
			
			tnx.commit();
			
			System.out.println("One to One done");
			
		}catch(Exception e){
			tnx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		
		
	}

	@Override
	public void ManyToOneMapping() {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction tnx=null;
		try{
			tnx=session.beginTransaction();
			Lead lead=new Lead("M105411", "PRASHANA", "JAVA");
			Lead lead1=new Lead("M105410", "MUKESH", "DS");
			
			OrchardProgramInfo info= new OrchardProgramInfo("M1043014", "NIRMAL", "DS", lead1);
			OrchardProgramInfo info1= new OrchardProgramInfo("M1043013", "SUDEHS", "DS", lead);
			
			session.save(info);
			session.save(info1);
			
			tnx.commit();
			
			System.out.println(" Many to One done");
			
		}catch(Exception e){
			tnx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		
		
	}

	@Override
	public void OnetoManyMapping() {
		// TODO Auto-generated method stub
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction tnx=null;
		try{
			tnx=session.beginTransaction();
			Lead lead=new Lead("M105409", "PRAKASH", "JAVA");
			Lead lead1=new Lead("M105408", "MONICA", "DS");
			
			OrchardProgramInfo info= new OrchardProgramInfo("M1043014", "NIRMAL", "DS", lead1);
			OrchardProgramInfo info1= new OrchardProgramInfo("M1043013", "SUDEHS", "DS", lead);
			
			(lead.getOrchardProgramInfos()).add(info);
				(lead.getOrchardProgramInfos()).add(info1);
		 	
			session.save(lead);
			session.save(lead1);
			
			
			
			
			tnx.commit();
			
			System.out.println(" Many to One done");
			
		}catch(Exception e){
			tnx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		
		
	}

	@Override
	public CampusMind retrieve(String mid_lead) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction tnx=null;
		try{
			tnx=session.beginTransaction();
			List<Lead> lead=session.createQuery("from Lead where mid_lead = '"+ mid_lead + "'").list();
			List<CampusMind> cm= lead.get(0).getCampusMind();
			for(CampusMind mind : cm){
				System.out.println("        "+ lead.get(0).getTrack() + "       " +
						lead.get(0).getName_lead() + "       " + mind.getName_campus_mind());
			}
			
			
		}catch(HibernateException e){
			tnx.rollback();
			e.printStackTrace();
			return null;
		}finally{
			session.close();
		}
		
		
		return null;
		
	}

	
	

}
