package fileHandling.fileReadWrite;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo8BufferedOutputStream {
    public static void main(String[] args) {
        File file = new File("abc.txt");
        try (FileOutputStream fileOutputStream = new FileOutputStream(file, true);
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)) {
            bufferedOutputStream.write('p');
            bufferedOutputStream.write('q');
            bufferedOutputStream.write('r');
        } catch (IOException ioException) {
            System.out.println("issue in writing the file");
        }
    }
}
