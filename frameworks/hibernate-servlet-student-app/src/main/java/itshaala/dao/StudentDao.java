package itshaala.dao;

import itshaala.configuration.HibernateUtil;
import itshaala.model.Student;
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

    public void updateStudent(Student student) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        session.update(student);
        transaction.commit();
        session.close();
    }

    public void deleteStudent(Student student) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        session.delete(student);
        transaction.commit();
        session.close();
    }

    public Student getStudent(int studentId) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        Student student = session.get(Student.class, studentId);
        transaction.commit();
        session.close();
        return student;
    }
}
