package com.cg.placement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="certificate1")

public class Certificate 
{
	@Id
	@Column(name="certificate_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int cyear;
	private String ccollege;
	
	
	@OneToOne(mappedBy="certificate")
	private Student student;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	


	public int getCyear() {
		return cyear;
	}


	public void setCyear(int cyear) {
		this.cyear = cyear;
	}


	public String getCcollege() {
		return ccollege;
	}


	public void setCcollege(String ccollege) {
		this.ccollege = ccollege;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
	
	
}
