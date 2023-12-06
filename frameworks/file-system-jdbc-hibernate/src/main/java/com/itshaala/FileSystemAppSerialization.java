package com.itshaala;

import com.itshaala.model.Course;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileSystemAppSerialization {
    public static void main(String[] args) throws IOException {
        Course course = Course.builder()
                .courseId(101)
                .courseName("Java")
                .coursePrice(99)
                .build();

        File file = new File("course.txt");
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(course);
        objectOutputStream.close();
        fileOutputStream.close();
    }
}
