package com.itshaala.service;

import com.itshaala.dao.CourseDao;
import com.itshaala.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    CourseDao courseDao;

    public CourseService(){
        System.out.println("Course Service Constructor");
    }

    public void addCourse(Course course) {
        courseDao.addCourse(course);
    }
}
