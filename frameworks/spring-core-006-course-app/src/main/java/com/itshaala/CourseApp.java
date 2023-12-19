package com.itshaala;

import com.itshaala.configuration.SpringBeanConfiguration;
import com.itshaala.controller.CourseController;
import com.itshaala.model.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CourseApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBeanConfiguration.class);
        CourseController courseController = applicationContext.getBean(CourseController.class);
        courseController.addCourse(new Course(1, "Spring Master", 99));
    }
}
