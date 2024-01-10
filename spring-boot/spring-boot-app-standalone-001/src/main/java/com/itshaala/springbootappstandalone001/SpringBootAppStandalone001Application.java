package com.itshaala.springbootappstandalone001;

import com.itshaala.springbootappstandalone001.dao.CourseDao;
import com.itshaala.springbootappstandalone001.model.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBootAppStandalone001Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootAppStandalone001Application.class, args);
        CourseDao courseDao = context.getBean(CourseDao.class);
        List<Course> allCourses = courseDao.getAllCourses();
        allCourses.forEach(System.out::println);
    }

}
