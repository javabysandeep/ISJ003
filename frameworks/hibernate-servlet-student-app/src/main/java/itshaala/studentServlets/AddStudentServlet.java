package itshaala.studentServlets;

import itshaala.controller.StudentController;
import itshaala.model.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(value = "/add", loadOnStartup = 1)
public class AddStudentServlet extends HttpServlet {
    public AddStudentServlet() {
        System.out.println("Servlet constructor");
    }

    StudentController studentController = new StudentController();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String studentName = req.getParameter("name");
        String studentAddress = req.getParameter("address");
        Student student = Student.builder()
                .studentName(studentName)
                .studentAddress(studentAddress)
                .build();
        studentController.addStudent(student);
        PrintWriter writer = resp.getWriter();
        writer.println("Student added successfully");
    }
}
