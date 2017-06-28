package com.figo.ssh.dao.impl;

import com.figo.ssh.dao.StudentDao;
import com.figo.ssh.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository(value = "StudentDao")
public class StudentDaoImpl implements StudentDao {
    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    public Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public List<Student> getAll() {
        String hql = "FROM Student";
        return getSession().createQuery(hql).list();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
