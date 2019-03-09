package com.companyname.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	@Id
	@Column(name = "studid")
	int studid;

	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}

	public String getStudname() {
		return studname;
	}

	public void setStudname(String studname) {
		this.studname = studname;
	}

	public Student(int studid, String studname, int studroll) {
		super();
		this.studid = studid;
		this.studname = studname;
		this.studroll = studroll;
	}

	@Override
	public String toString() {
		return "Student [studid=" + studid + ", studname=" + studname + ", studroll=" + studroll + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudroll() {
		return studroll;
	}

	public void setStudroll(int studroll) {
		this.studroll = studroll;
	}

	@Column(name = "studname")
	String studname;
	@Column(name = "Studroll")
	int studroll;

}
