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
import java.util.ArrayList;
import java.util.List;

public class HibernateAppInsertObject {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        List<String> courseFeatures = new ArrayList<>();
        courseFeatures.add("Live classes 100% ");
        courseFeatures.add("Live code execution");
        courseFeatures.add("Best in class notes");
        Course course = Course.builder()
                .courseName("Java Fullstack ")
                .coursePrice(129)
                .courseFeatures(courseFeatures)
                .build();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(course);
        transaction.commit();
        System.out.println("Course object saved in the database");
    }
}
