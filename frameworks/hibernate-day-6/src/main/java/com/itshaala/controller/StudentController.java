package com.itshaala.controller;

import com.itshaala.model.Student;
import com.itshaala.service.StudentService;

public class StudentController {
    StudentService studentService = new StudentService();

    public void addStudent(Student student) {
        studentService.addStudent(student);
    }
    public void updateStudent(Student student) {
        studentService.updateStudent(student);
    }

    public void deleteStudent(Student student) {
        studentService.deleteStudent(student);
    }

    public Student getStudent(int studentId) {
        return studentService.getStudent(studentId);
    }
}
