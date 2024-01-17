package com.itshaala.springbootreadingproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class ApplicationPropertiesReaderValue implements CommandLineRunner {

    @Value("${movie.name}")
    String movieName;

    @Value("${movie.actor}")
    String movieActor;

    @Value("${movie.rating}")
    String movieRating;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Movie name  =" + movieName);
        System.out.println("Movie Actor =  " + movieActor);
        System.out.println("Movie Rating = " + movieRating);
    }
}
