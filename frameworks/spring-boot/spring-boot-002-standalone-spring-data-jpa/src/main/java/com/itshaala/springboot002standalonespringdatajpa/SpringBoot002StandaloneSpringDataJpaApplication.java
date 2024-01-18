package com.itshaala.springboot002standalonespringdatajpa;

import com.itshaala.springboot002standalonespringdatajpa.controller.CourseController;
import com.itshaala.springboot002standalonespringdatajpa.model.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot002StandaloneSpringDataJpaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBoot002StandaloneSpringDataJpaApplication.class, args);
        CourseController controller = context.getBean(CourseController.class);
        /*controller.addCourse(Course.builder()
                .courseName("Spring Boot")
                .coursePrice(8788888)
                .build());*/

        controller.getAllCourses().forEach(System.out::println);

    }

}
