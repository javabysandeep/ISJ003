package fileHandling.fileClass;

import java.io.File;
import java.io.IOException;

public class Demo7FileSize {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        System.out.println(file.length());

    }
}
