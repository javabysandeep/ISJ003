package model;

import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Lead {
    private int id;
    private String name;
    private int mobile;
    private String email;
    private String source;
    private LocalDateTime createdAt;
}
