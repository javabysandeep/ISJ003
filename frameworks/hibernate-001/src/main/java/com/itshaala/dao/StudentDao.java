package com.itshaala.dao;

import com.itshaala.configuration.HibernateUtil;
import com.itshaala.model.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDao {
    public void addStudent(Student student) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
        session.close();
    }
}
