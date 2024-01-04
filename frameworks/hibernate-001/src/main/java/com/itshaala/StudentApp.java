package com.itshaala;

import com.itshaala.controller.CourseController;
import com.itshaala.controller.StudentController;
import com.itshaala.model.Course;
import com.itshaala.model.Student;

public class StudentApp {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
       /* Student studentToUpdate = Student.builder().studentId(2).studentName("Salman S")
                .studentAddress("Pune West").
                build();
        studentController.deleteStudent(studentToUpdate);*/
        System.out.println(studentController.getStudent(1));
    }
}
