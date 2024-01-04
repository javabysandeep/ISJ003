package com.itshaala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.cfg.xml");
        Movie movie = applicationContext.getBean("movieReference", Movie.class);
        System.out.println(movie);
    }
}
