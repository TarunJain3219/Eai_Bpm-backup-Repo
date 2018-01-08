package com.example.orchard.main;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="LEAD")
public class Lead implements Serializable{
	

	@Column(name="MID_CAMPUS_MIND")
	private String mid_campus_mind;
	
	@Id
	@Column(name="MID_LEAD")
	private String mid_lead;
	
	
	@Column(name="NAME_LEAD")
	private String name_lead;
	
	
	
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private CampusMind campusMind;
	
	
	public String getMid_lead() {
		return mid_lead;
	}
	public void setMid_lead(String mid_lead) {
		this.mid_lead = mid_lead;
	}
	public String getName_lead() {
		return name_lead;
	}
	public void setName_lead(String name_lead) {
		this.name_lead = name_lead;
	}
	
	public CampusMind getCampusMind() {
		return campusMind;
	}
	public void setCampusMind(CampusMind campusMind) {
		this.campusMind = campusMind;
	}
	

}