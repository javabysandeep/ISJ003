package com.itshaala.preparedStatementDemos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Course {
    /*
    * course_id	int
    course_name	varchar(200)
    course_duration	varchar(200)
    course_content	varchar(500)
    intake	int
    course_price	int
    * */
    private int courseId;
    private String courseName;
    private String courseDuration;
    private String courseContent;
    private int courseIntake;
    private int coursePrice;
}
