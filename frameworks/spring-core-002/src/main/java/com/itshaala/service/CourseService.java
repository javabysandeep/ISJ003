package com.itshaala.service;

import com.itshaala.courseDao.CourseDao;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Data
public class CourseService {

    @Autowired
    private CourseDao courseDao;

    public void add() {
        courseDao.add();
    }
}
