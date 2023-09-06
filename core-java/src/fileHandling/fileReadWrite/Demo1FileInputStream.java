package fileHandling.fileReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo1FileInputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("src/misc/Node.java");
        //TO read from a file which contains text : FIS, BIS, FR, BR
        FileInputStream fileInputStream = new FileInputStream(file);
        int character = fileInputStream.read();
        while (character != -1) {
            System.out.print((char) character);
            character = fileInputStream.read();
        }
        fileInputStream.close();

    }
}
