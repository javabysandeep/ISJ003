package com.itshaala;

import com.itshaala.controller.CourseController;
import com.itshaala.controller.StudentController;
import com.itshaala.model.Course;
import com.itshaala.model.Student;

public class StudentApp {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        Student student = Student.builder()
                .studentName("Salman")
                .studentAddress("Shrilanka")
                .build();
        studentController.addStudent(student);
    }
}
