package com.itshaala.controller;

import com.itshaala.model.Course;
import com.itshaala.service.CourseService;

import java.util.List;

public class CourseController {
    CourseService courseService = new CourseService();
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    public void updateCourse(Course course){
        courseService.updateCourse(course);
    }

    public void deleteCourse(int courseId) {
        courseService.deleteCourse(courseId);
    }
}
