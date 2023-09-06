package fileHandling.fileReadWrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo9FileWriter {
    public static void main(String[] args) {
        File file = new File("abc.txt");
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write("writing multiple characters using file writer");
        } catch (IOException ioException) {
            System.out.println("issue in writing the file");
        }
    }
}
