package com.itshaala;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReading {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Work\\ISJ003\\frameworks\\reading-properties-file\\src\\main\\java\\com\\itshaala\\application.properties");
        FileInputStream fileInputStream = new FileInputStream(file);
        int data = fileInputStream.read();
        while (data != -1) {
            System.out.print((char) data);
            data = fileInputStream.read();
        }
        fileInputStream.close();
    }
}
