package com.itshaala.springbootreadingproperties;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class CommandLineRunnerImpl implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Command Line arguments using Ellipsis operator");
        for (String temp:args){
            System.out.println(temp);
        }
    }
}
