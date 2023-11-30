package model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Course {
    private int id;
    private String name;
    private int price;
}
