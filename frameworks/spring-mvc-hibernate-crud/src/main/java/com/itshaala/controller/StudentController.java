package com.itshaala.controller;

import com.itshaala.model.Student;
import com.itshaala.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public ModelAndView createStudent(@ModelAttribute Student student) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("student");
        modelAndView.addObject("data", student);
        studentService.save(student);
        return modelAndView;
    }


    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView getAllStudents() {
        List<Student> studentList = studentService.getAllStudents();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("listStudents");
        modelAndView.addObject("data", studentList);
        return modelAndView;
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public ModelAndView getStudentById(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("studentById");
        Student student = studentService.getStudentById(id);
        modelAndView.addObject("data", student);
        return modelAndView;
    }
}
