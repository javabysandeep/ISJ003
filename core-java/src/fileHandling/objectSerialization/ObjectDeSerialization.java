package fileHandling.objectSerialization;

import java.io.*;

public class ObjectDeSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("student.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student student = (Student) objectInputStream.readObject();
        System.out.println(student);
    }
}
