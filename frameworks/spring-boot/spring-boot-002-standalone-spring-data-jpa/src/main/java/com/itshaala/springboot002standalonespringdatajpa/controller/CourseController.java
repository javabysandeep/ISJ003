package com.itshaala.springboot002standalonespringdatajpa.controller;

import com.itshaala.springboot002standalonespringdatajpa.model.Course;
import com.itshaala.springboot002standalonespringdatajpa.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CourseController {
    @Autowired
    CourseService courseService;

    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    public void addCourse(Course  course){
        courseService.addCourse(course);
    }
}
