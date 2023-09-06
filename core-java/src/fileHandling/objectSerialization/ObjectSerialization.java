package fileHandling.objectSerialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSerialization {
    public static void main(String[] args) throws IOException {
        File file = new File("student.txt");
        file.createNewFile();
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);) {
            Student student = new Student(1, "admin", "pass");
            objectOutputStream.writeObject(student);
            System.out.println("student object saved successfully");
        }catch (IOException ioException){
            System.out.println("Issue in saving the object");
        }

    }
}
