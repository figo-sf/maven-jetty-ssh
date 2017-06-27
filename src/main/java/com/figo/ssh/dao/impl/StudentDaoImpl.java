package com.figo.ssh.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.figo.ssh.dao.StudentDao;
import com.figo.ssh.entity.Student;

public class StudentDaoImpl implements StudentDao {
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}
	@Override
	public List<Student> getAll() {
		String hql = "FROM Student";
		return getSession().createQuery(hql).list();
	}
}
