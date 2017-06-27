package com.figo.ssh.service.impl;

import com.figo.ssh.dao.StudentDao;
import com.figo.ssh.entity.Student;
import com.figo.ssh.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
	private StudentDao studentDao;

	@Override
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public List<Student> getAll() {
		return studentDao.getAll();
	}
	
	
}
