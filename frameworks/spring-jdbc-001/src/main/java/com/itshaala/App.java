package com.itshaala;

import com.itshaala.configuration.SpringConfig;
import com.itshaala.controller.CourseController;
import com.itshaala.dao.CourseDao;
import com.itshaala.model.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        CourseController courseController = applicationContext.getBean(CourseController.class);
        Course course = new Course(1002, "Sales Master class", 199);
        //courseController.addCourse(course);//ADD
        //courseController.updateCourse(course);//UPDATE
       // courseController.deleteCourseById(1001);//DELETE

        CourseDao courseDao = applicationContext.getBean(CourseDao.class);
        System.out.println(courseDao.getCourseById(1002));

        courseDao.getAllCourses().forEach(System.out::println);

    }
}
