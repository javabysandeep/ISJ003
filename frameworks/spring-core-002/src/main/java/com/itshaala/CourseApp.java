package com.itshaala;

import com.itshaala.controller.CourseController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CourseApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CourseController.class);
        CourseController courseController = applicationContext.getBean(CourseController.class);
        courseController.add();
    }
}
