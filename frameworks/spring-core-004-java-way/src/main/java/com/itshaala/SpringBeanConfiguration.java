package com.itshaala;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfiguration {

    @Bean(name = "movieReference")
    public Movie getMovie() {
        return new Movie(1, "Sallar", 899);
    }
}
