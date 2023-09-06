package fileHandling.fileReadWrite;

import java.io.*;

public class Demo10BufferedWriter {
    public static void main(String[] args) {
        File file = new File("abc.txt");
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(" bufferedwriter is faster than filewriter");
        } catch (IOException ioException) {
            System.out.println("issue in writing the file");
        }
    }
}
