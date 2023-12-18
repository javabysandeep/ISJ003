package com.itshaala.controller;

import com.itshaala.service.CourseService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CourseController {

    @Autowired
    private CourseService courseService;

    public void add() {
        courseService.add();
    }
}
