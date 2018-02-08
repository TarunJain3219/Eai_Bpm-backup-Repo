package com.example.orchardprogram.main;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="CAMPUS_MIND")

public class CampusMind implements Serializable {
	
	public CampusMind(){
		
	}
	
	public CampusMind(String mid_campus_mind, String name_campus_mind,  Lead lead) {
		super();
		this.mid_campus_mind = mid_campus_mind;
		this.name_campus_mind = name_campus_mind;
		
		this.lead = lead;
	}
	@Id
	@Column(name="MID_CAMPUS_MIND")
	private String mid_campus_mind;
	
	@Column(name="NAME_CAMPUS_MIND")
	private String name_campus_mind;
	
	
	
	//@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="MID_LEAD")
	
	private Lead lead;
	
	
	
	public Lead getLead() {
		return lead;
	}
	public void setLead(Lead lead) {
		this.lead = lead;
	}
	@Override
	public String toString() {
		return "CampusMind [mid_campus_mind=" + mid_campus_mind + ", name_campus_mind=" + name_campus_mind +  "]";
	}
	
	
	
	
	public String getMid_campus_mind() {
		return mid_campus_mind;
	}
	public void setMid_campus_mind(String mid_campus_mind) {
		this.mid_campus_mind = mid_campus_mind;
	}
	public String getName_campus_mind() {
		return name_campus_mind;
	}
	public void setName_campus_mind(String name_campus_mind) {
		this.name_campus_mind = name_campus_mind;
	}
	
	
	

}
