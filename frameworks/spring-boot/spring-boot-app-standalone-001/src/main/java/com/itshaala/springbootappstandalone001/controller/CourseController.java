package com.itshaala.springbootappstandalone001.controller;

import com.itshaala.springbootappstandalone001.model.Course;
import com.itshaala.springbootappstandalone001.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CourseController {

    @Autowired
    CourseService courseService;

    public void addCourse(Course course) {
        courseService.addCourse(course);
    }

    public void updateCourse(Course course) {
        courseService.updateCourse(course);
    }

    public void deleteCourseById(int courseId) {
        courseService.deleteCourseById(courseId);
    }
}
