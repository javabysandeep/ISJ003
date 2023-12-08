package com.itshaala.dao;

import com.itshaala.configuration.HibernateConfigurationUtil;
import com.itshaala.model.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDao {
    public void addStudent(Student student) {
        Session session = HibernateConfigurationUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
    }

    public void updateStudent(Student student) {
        Session session = HibernateConfigurationUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(student);
        transaction.commit();
    }

    public void deleteStudent(Student student) {
        Session session = HibernateConfigurationUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(student);
        transaction.commit();
    }

    public Student getStudent(int studentId) {
        Session session = HibernateConfigurationUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Student student = session.get(Student.class, studentId);
        transaction.commit();
        return student;
    }
}
