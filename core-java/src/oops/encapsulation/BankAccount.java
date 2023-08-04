package oops.encapsulation;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class BankAccount {
    private int id;
    private String name;
    private int balance;

}
