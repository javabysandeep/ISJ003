package com.itshaala.controller;

import com.itshaala.model.Student;
import com.itshaala.service.StudentService;

public class StudentController {
    StudentService studentService = new StudentService();

    public void addStudent(Student student) {
        studentService.addStudent(student);
    }
}
