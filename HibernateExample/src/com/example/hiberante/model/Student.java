package com.example.hiberante.model;

import java.io.Serializable;

import javax.persistence.*;
/*import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table; */	

@Entity
@Table(name="STUDENT")
public class Student implements Serializable {
	private static final long serialVersionUID = 8633415090390966715L;
	
	 @Id
	 @Column(name="ID")
	 @GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	 @Column(name="STUDENT_NAME")
	String  studentName;
	
	 @Column(name="ROLL_NUMBER")
	int rollnumber;
	
	 @Column(name="COURSE")
	String course;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
		
}
