package fileHandling.fileClass;

import java.io.File;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        File file  = new File("folder1/abc.txt");
        System.out.println(file.createNewFile());
    }
}
