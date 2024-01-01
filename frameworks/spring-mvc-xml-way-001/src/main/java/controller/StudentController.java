package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class StudentController {

    @GetMapping("/student")
    public String getStudent() {
        return "Get Student details";
    }

    @PostMapping("/student")
    public String createStudent() {
        return "Create Student";
    }

    @PutMapping("/student")
    public String updateStudent() {
        return "Updated Student details";
    }

    @DeleteMapping("/student")
    public String deleteStudent() {
        return "deleted Student";
    }

}
