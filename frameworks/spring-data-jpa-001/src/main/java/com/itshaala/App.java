package com.itshaala;

import com.itshaala.configuration.SpringConfiguration;
import com.itshaala.controller.CourseController;
import com.itshaala.model.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        CourseController courseController = applicationContext.getBean(CourseController.class);
        Course course = new Course(1, "Spring data JPA", 90);
        courseController.add(course);
    }
}
