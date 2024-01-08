package com.itshaala.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Student {
    private int id;
    private String name;
    private String phone;
    private String email;
    private String address;
}
