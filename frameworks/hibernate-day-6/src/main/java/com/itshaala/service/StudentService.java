package com.itshaala.service;

import com.itshaala.configuration.HibernateConfigurationUtil;
import com.itshaala.dao.StudentDao;
import com.itshaala.model.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

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
