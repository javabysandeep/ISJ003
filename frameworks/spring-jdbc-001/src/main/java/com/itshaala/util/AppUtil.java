package com.itshaala.util;

import lombok.Getter;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AppUtil {

    @Getter
    public static final Properties properties = new Properties();

    static {
        try {
            properties.load(new FileInputStream("C:\\Work\\ISJ003\\frameworks\\spring-jdbc-001\\src\\main\\resources\\application.properties"));
        } catch (IOException e) {
            System.out.println("issue in loading the properties");
        }
    }
}
