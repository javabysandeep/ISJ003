package model;

import lombok.*;

//@Data
public class Course {
    private int courseId;
    private String courseName;
    private int coursePrice;

    public Course() {
    }

    public Course(int courseId, String courseName, int coursePrice) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.coursePrice = coursePrice;
    }
}
