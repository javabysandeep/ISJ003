package fileHandling.fileClass;

import java.io.File;
import java.io.IOException;

public class Demo8ListFileNames {
    public static void main(String[] args) throws IOException {
      File folder = new File("src/exceptionHandling");
        String[] fileNameList = folder.list();
        for (String fileName:fileNameList) {
            System.out.println(fileName);
        }
    }
}
