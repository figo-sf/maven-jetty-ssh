package com.figo.ssh.service.impl;

import com.figo.ssh.dao.StudentDao;
import com.figo.ssh.entity.Student;
import com.figo.ssh.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
	@Resource(name = "StudentDao")
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
