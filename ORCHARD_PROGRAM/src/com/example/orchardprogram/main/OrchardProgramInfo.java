package com.example.orchardprogram.main;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="ORCHARD_PROGRAM_DETAILS")
public class OrchardProgramInfo implements Serializable {
	
	@Id
	@Column(name="MID_CAMPUS_MIND")
	private String mid_campus_mind;
	
	@Column(name="NAME_CAMPUS_MIND")
	private String name_campus_mind;
	
	@Column(name="TRACK")
	private String track;
	
	
	/*private OrchardProgramInfo orchardProgramInfo;
	 
	 @ManyToOne(cascade=CascadeType.ALL)  
	public OrchardProgramInfo getOrchardProgramInfo() {
		return orchardProgramInfo;
	}


	public void setOrchardProgramInfo(OrchardProgramInfo orchardProgramInfo) {
		this.orchardProgramInfo = orchardProgramInfo;
	}*/


	@Override
	public String toString() {
		return "OrchardProgramInfo [mid_campus_mind=" + mid_campus_mind + ", name_campus_mind=" + name_campus_mind
				+ ", track=" + track + ", lead=" + lead + "]";
	}


	public OrchardProgramInfo(String mid_campus_mind, String name_campus_mind, String track, Lead lead) {
		
		this.mid_campus_mind = mid_campus_mind;
		this.name_campus_mind = name_campus_mind;
		this.track = track;
		//this.name_lead = name_lead;
		this.lead = lead;
	}


	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	//@JoinColumn(name="NAME_LEAD",insertable=false,updatable=false)
	private Lead lead;


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


	public String getTrack() {
		return track;
	}


	public void setTrack(String track) {
		this.track = track;
	}


	


	public Lead getLead() {
		return lead;
	}


	public void setLead(Lead lead) {
		this.lead = lead;
	}
	
	
	

}
