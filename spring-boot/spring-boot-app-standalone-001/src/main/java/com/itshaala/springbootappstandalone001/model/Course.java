package com.itshaala.springbootappstandalone001.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Course {
    private int courseId;
    private String courseName;
    private int coursePrice;
}
