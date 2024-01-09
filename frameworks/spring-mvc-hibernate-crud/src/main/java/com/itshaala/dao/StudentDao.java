package com.itshaala.dao;

import com.itshaala.model.Student;
import com.itshaala.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDao {
    public void save(Student student) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Object saved = session.save(student);
        System.out.println("student saved " + saved);
        transaction.commit();
        session.close();
    }

    public List<Student> getAllStudents() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Student ");
        List<Student> studentList = query.list();
        session.close();
        return studentList;
    }

    public Student getStudentById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Student student = session.get(Student.class, id);
        session.close();
        return student;
    }
}
