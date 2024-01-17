package com.itshaala.springbootreadingproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.util.Properties;

@Component
@Order(2)
public class ApplicationPropertiesReader implements CommandLineRunner {

    @Autowired
    Environment properties;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(properties.getProperty("movie.name"));
        System.out.println(properties.getProperty("movie.rating"));
        System.out.println(properties.getProperty("movie.actor"));
    }
}
