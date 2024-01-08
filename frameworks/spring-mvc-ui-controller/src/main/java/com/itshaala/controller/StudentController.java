package com.itshaala.controller;

import com.itshaala.model.Student;
import com.itshaala.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public ModelAndView addStudent(@ModelAttribute Student student) {
        ModelAndView modelAndView = new ModelAndView();
        System.out.println(student);
        modelAndView.setViewName("student");
        modelAndView.addObject("data", student);
        studentService.addStudent(student);
        return modelAndView;
    }
}
