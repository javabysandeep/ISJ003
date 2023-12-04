package com.itshaala.service;

import com.itshaala.dao.StudentDao;
import com.itshaala.model.Student;

public class StudentService {
    StudentDao studentDao = new StudentDao();

    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }
}
