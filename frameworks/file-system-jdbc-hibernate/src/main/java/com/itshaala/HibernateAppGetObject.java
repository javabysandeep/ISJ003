package com.itshaala;

import com.itshaala.model.Course;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HibernateAppGetObject {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Course course = session.get(Course.class, 2);
        System.out.println(course);
    }
}
