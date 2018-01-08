package com.example.orchardprogram.main;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="LEAD")
public class Lead implements Serializable {
	
	public Lead(){
		
	}
	public Lead(String mid_lead, String name_lead, String track) {
		super();
		this.mid_lead = mid_lead;
		this.name_lead = name_lead;
		this.track = track;
	}
	@Override
	public String toString() {
		return "Lead [ mid_lead=" + mid_lead + ", name_lead=" + name_lead
				+  "]";
	}
	
	
	@Id
	@Column(name="MID_LEAD")
	private String mid_lead;
	
	@Column(name="NAME_LEAD")
	private String name_lead;
	

	@Column(name="TRACK")
	private String track;
	
	
//	Set<CampusMind> campusMind;
//	
//	public Set<CampusMind> getCampusMind() {
//		return campusMind;
//	}
//	public void setCampusMind(Set<CampusMind> campusMind) {
//		this.campusMind = campusMind;
//	}
	
	@OneToMany(/*cascade=CascadeType.ALL,fetch = FetchType.LAZY,*/mappedBy="lead")
	private List<CampusMind> campusMind;
	
	
	public List<CampusMind>getCampusMind() {
		return campusMind;
	}
	public void setCampusMind(List<CampusMind> campusMind) {
		this.campusMind = campusMind;
	}


	@OneToMany(/*cascade=CascadeType.ALL,fetch = FetchType.LAZY,*/mappedBy="lead")
	
	private Set<OrchardProgramInfo> orchardProgramInfos=new HashSet<OrchardProgramInfo>();
	
	

public Set<OrchardProgramInfo> getOrchardProgramInfos() {
		return orchardProgramInfos;
	}
	public void setOrchardProgramInfos(Set<OrchardProgramInfo> orchardProgramInfos) {
		this.orchardProgramInfos = orchardProgramInfos;
	}
public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}

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
	
	
	

}
