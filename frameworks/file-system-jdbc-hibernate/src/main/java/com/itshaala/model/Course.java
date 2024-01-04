package com.itshaala.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Getter
@Setter
@Entity(name = "course")
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "course_id")
    private int courseId;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "course_price")
    private int coursePrice;

    @ElementCollection
    @CollectionTable(name = "course_features_table")
    @Column(name = "course_features")
    private List<String> courseFeatures;
}
