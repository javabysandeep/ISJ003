package com.itshaala.dao;

import com.itshaala.configuration.HibernateConfigurationUtil;
import com.itshaala.model.Course;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class CourseDao {
    public List<Course> getAllCourses() {
        Session session = HibernateConfigurationUtil.getSessionFactory().openSession();
       // Query<Course> query = session.createQuery("from course where courseId=1");
        Query<Course> query = session.createQuery("from course");
        List<Course> courseList = query.list();
        return courseList;
    }

    public void updateCourse(Course course) {
        Session session = HibernateConfigurationUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query<Course> query = session.createQuery("update course set coursePrice=20000 where courseName like 'Python'");
        query.executeUpdate();
        transaction.commit();
        System.out.println("course updated");
    }

    public void deleteCourse(int id) {
        Session session = HibernateConfigurationUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query<Course> query = session.createQuery("delete course where courseId=:id");
        query.setParameter("id",id);
        query.executeUpdate();
        transaction.commit();
        System.out.println("course deleted");
    }
}
