package com.itshaala;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Movie {
    private int movieId;
    private String movieName;
    private int moviePrice;
}
