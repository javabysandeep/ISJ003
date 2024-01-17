package com.itshaala.springbootreadingproperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.itshaala"})
public class SpringBootReadingPropertiesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootReadingPropertiesApplication.class, args);
        //System.out.println("Sum of numbers is " + add(10, 20, 30, 40, 50, 60));
    }

    static public int add(int... numbers) {
        int sum = 0;
        for (int temp : numbers) {
            sum += temp;
        }
        return sum;
    }

}
