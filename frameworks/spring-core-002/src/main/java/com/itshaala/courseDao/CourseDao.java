package com.itshaala.courseDao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Data
@Component
public class CourseDao {
    public void add() {
        System.out.println("course dao course added");
    }
}
