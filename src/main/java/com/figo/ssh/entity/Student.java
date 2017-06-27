package com.figo.ssh.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="ssh_student")
public class Student {
	@Id @Column(name="student_id")
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer studentId;
	private String name; //Can't be alerted
	private Date birth;
	@ManyToOne(targetEntity=School.class)
	@JoinColumn(name="schoolid",referencedColumnName="school_id")
	private School school;


	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}


	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}
}
