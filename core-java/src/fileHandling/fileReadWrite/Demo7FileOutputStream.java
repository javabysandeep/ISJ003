package fileHandling.fileReadWrite;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo7FileOutputStream {
    public static void main(String[] args) {
        File file = new File("abc.txt");
        try (FileOutputStream fileOutputStream = new FileOutputStream(file, true)) {
            fileOutputStream.write('X');
            fileOutputStream.write('Y');
            fileOutputStream.write('Z');
        } catch (IOException ioException) {
            System.out.println("issue in writing the file");
        }
    }
}
