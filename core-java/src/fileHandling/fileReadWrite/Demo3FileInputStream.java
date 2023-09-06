package fileHandling.fileReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo3FileInputStream {
    public static void main(String[] args) {
        File file = new File("src/misc/Node.java");
        //TO read from a file which contains text : FIS, BIS, FR, BR
        int character = 0;
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            character = fileInputStream.read();
            while (character != -1) {
                System.out.print((char) character);
                character = fileInputStream.read();
            }
        } catch (IOException e) {
            System.out.println("There is issue in the file. Please check the file");
        }

    }
}
