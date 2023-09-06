package fileHandling.fileReadWrite;

import java.io.*;

public class Demo6BufferedReader {
    public static void main(String[] args) {
        File file = new File("src/misc/Node.java");
        //TO read from a file which contains text : FIS, BIS, FR, BR
        int character = 0;
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            character = bufferedReader.read();
            while (character != -1) {
                System.out.print((char) character);
                character = bufferedReader.read();
            }
        } catch (IOException e) {
            System.out.println("There is issue in the file. Please check the file");
        }

    }
}
