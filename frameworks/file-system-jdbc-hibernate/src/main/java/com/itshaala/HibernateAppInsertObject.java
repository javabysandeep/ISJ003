package com.itshaala;

import com.itshaala.model.Course;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HibernateAppInsertObject {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Course course = Course.builder()
                .courseId(102)
                .courseName("Python")
                .coursePrice(99)
                .build();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(course);
        transaction.commit();
        System.out.println("Course object saved in the database");
    }
}
