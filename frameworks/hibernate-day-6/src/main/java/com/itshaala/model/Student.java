package com.itshaala.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity(name = "student")
public class Student {
    @Id
    @Column(name = "student_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "phone_number")
    private int phoneNumber;

    @Column(name = "address")
    private String address;

    @ElementCollection
    @Column(name = "result")
    private HashMap<String, Integer> result = new HashMap<>();
}
