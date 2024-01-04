package com.itshaala.service;

import com.itshaala.dao.StudentDao;
import com.itshaala.model.Student;

public class StudentService {
    StudentDao studentDao = new StudentDao();

    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }

    public void deleteStudent(Student student) {
        studentDao.deleteStudent(student);
    }

    public Student getStudent(int studentId) {
        return studentDao.getStudent(studentId);
    }
}
