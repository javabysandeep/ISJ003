package com.itshaala.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity(name = "fte")
@DiscriminatorValue("fte")
public class FullTimeEmployee extends Employee {
    private int salary;
}
