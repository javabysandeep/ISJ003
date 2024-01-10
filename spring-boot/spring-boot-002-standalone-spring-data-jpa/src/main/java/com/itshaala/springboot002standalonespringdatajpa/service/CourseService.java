package com.itshaala.springboot002standalonespringdatajpa.service;

import com.itshaala.springboot002standalonespringdatajpa.dao.CourseDao;
import com.itshaala.springboot002standalonespringdatajpa.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseDao courseDao;

    public List<Course> getAllCourses() {
        return (List<Course>) courseDao.findAll();
    }

    public void addCourse(Course course) {
        courseDao.save(course);
    }
}
