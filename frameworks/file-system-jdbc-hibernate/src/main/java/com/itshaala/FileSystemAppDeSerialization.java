package com.itshaala;

import com.itshaala.model.Course;

import java.io.*;

public class FileSystemAppDeSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("course.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Course course = (Course) objectInputStream.readObject();
        System.out.println(course);
        objectInputStream.close();
        fileInputStream.close();
    }
}
