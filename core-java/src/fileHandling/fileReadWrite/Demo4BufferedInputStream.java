package fileHandling.fileReadWrite;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo4BufferedInputStream {
    public static void main(String[] args) {
        File file = new File("src/misc/Node.java");
        //TO read from a file which contains text : FIS, BIS, FR, BR
        int character = 0;
        try (FileInputStream fileInputStream = new FileInputStream(file);
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream)) {
            character = bufferedInputStream.read();
            while (character != -1) {
                System.out.print((char) character);
                character = bufferedInputStream.read();
            }
        } catch (IOException e) {
            System.out.println("There is issue in the file. Please check the file");
        }

    }
}
