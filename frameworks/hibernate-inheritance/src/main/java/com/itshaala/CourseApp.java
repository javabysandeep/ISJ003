package com.itshaala;

import com.itshaala.controller.CourseController;
import com.itshaala.model.Course;

import java.util.List;

public class CourseApp {
    public static void main(String[] args) {
        CourseController courseController = new CourseController();


       /* courseController.updateCourse(Course.builder()
                .courseId(1)
                .courseName("Fullstack Python updated")
                .coursePrice(2000)
                .build());*/

        courseController.deleteCourse(1);

        List<Course> courseList = courseController.getAllCourses();
        courseList.forEach(System.out::println);
    }
}
