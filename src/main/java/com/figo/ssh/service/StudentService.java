package com.figo.ssh.service;

import com.figo.ssh.dao.StudentDao;
import com.figo.ssh.entity.Student;

import java.util.List;

public interface StudentService {
	void setStudentDao(StudentDao studentDao);
	public List<Student> getAll();
}
