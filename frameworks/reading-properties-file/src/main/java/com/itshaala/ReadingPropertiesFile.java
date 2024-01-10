package com.itshaala;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesFile {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("C:\\Work\\ISJ003\\frameworks\\reading-properties-file\\src\\main\\resources\\application.properties"));
        System.out.println(properties.get("mysql_db_username"));
        System.out.println(properties.get("mysql_db_password"));
        System.out.println(properties.get("mysql_db_url"));
    }
}
