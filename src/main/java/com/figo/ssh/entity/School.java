package com.figo.ssh.entity;

import javax.persistence.*;

@Entity
@Table(name="ssh_school")
public class School {
	@Id @Column(name="school_id")
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer schoolId;

	@Column(name ="school_name")
	private String schoolName;


	public Integer getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}


}
