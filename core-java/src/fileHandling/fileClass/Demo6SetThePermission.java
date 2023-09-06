package fileHandling.fileClass;

import java.io.File;
import java.io.IOException;

public class Demo6SetThePermission {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        file.setWritable(false);
        System.out.println("Permission changed to read only");

    }
}
