package com.itshaala.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
//@Builder
@Entity(name = "contract_employee")
@DiscriminatorValue("contract")
public class ContractEmployee extends Employee {
    private int billAmount;
}
