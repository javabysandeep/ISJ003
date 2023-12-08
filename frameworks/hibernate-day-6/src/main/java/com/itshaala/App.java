package com.itshaala;

import com.itshaala.controller.StudentController;
import com.itshaala.model.Student;

import java.util.HashMap;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        HashMap<String, Integer> result = new HashMap<>();
        result.put("Physics", 67);
        result.put("Maths", 87);
        result.put("chemistry", 45);
        result.put("Biology", 81);
        result.put("English", 77);
        result.put("Marathi", 93);
        result.put("Hindi", 57);

        //1. save
        //2. update
        //3. get
        //4. delete
        Student student = Student.builder()
                .studentId(1)
                .studentName("Rushikesh")
                .phoneNumber(98989898)
                .address("Mumbai")
                .result(result)
                .build();

        studentController.addStudent(student);
        //studentController.updateStudent(student);
        //System.out.println(studentController.getStudent(1));
        //studentController.deleteStudent(student);
        //System.out.println("delete successfully");
    }
}
