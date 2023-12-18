package com.itshaala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationWay {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Movie.class);
        Movie movie = applicationContext.getBean("movie", Movie.class);
        System.out.println(movie);
    }
}
