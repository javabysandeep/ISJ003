package com.itshaala;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.itshaala"})
public class SpringBeanConfiguration {

    /*@Bean(name = "movieReference")
    public Movie getMovie() {
        return new Movie(1, "Sallar", 899);
    }*/
}
