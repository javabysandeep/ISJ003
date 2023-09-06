package fileHandling.fileClass;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class Demo9ListFileNamesFilter {
    public static void main(String[] args) throws IOException {
        File folder = new File("src/exceptionHandling");
        FilenameFilter filter = (dir, name) -> name.startsWith("D");
        String[] fileNameList = folder.list(filter);
        for (String fileName : fileNameList) {
            System.out.println(fileName);
        }
    }
}
