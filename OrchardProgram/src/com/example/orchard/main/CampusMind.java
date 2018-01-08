package com.example.orchard.main;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="CAMPUS_MIND")
public class CampusMind implements Serializable{
	@Id
	@Column(name="MID_CAMPUS_MIND")
	private String mid_campus_mind;
	
	@Column(name="TRACK")
	private String track;
	
	@Column(name="NAME_CAMPUS_MIND")
	private String name_campus_mind;
	
	@OneToOne(mappedBy="LEAD", cascade=CascadeType.ALL)
	private Lead lead;
	
	public Lead getLead() {
		return lead;
	}
	public void setLead(Lead lead) {
		this.lead = lead;
	}
	
	
	public String getMid_campus_mind() {
		return mid_campus_mind;
	}
	public void setMid_campus_mind(String mid_campus_mind) {
		this.mid_campus_mind = mid_campus_mind;
	}
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	public String getName_campus_mind() {
		return name_campus_mind;
	}
	public void setName_campus_mind(String name_campus_mind) {
		this.name_campus_mind = name_campus_mind;
	}
	
	

}
