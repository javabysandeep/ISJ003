package com.itshaala;

import com.itshaala.controller.CourseController;
import com.itshaala.model.Course;

public class App {
    public static void main(String[] args) {
        CourseController courseController = new CourseController();
        Course course = Course.builder()
                .courseName("hibernate")
                .coursePrice(300)
                .build();
        courseController.addCourse(course);
    }
}
