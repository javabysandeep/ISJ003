package fileHandling.fileClass;

import java.io.File;
import java.io.IOException;

public class Demo5DeleteFolder {
    public static void main(String[] args) throws IOException {
        File folder  = new File("folder1");
        System.out.println(folder.delete());
    }
}
