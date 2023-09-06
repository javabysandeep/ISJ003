package fileHandling.fileClass;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class Demo11ListFileFilter {
    public static void main(String[] args) throws IOException {
        File folder = new File("src/exceptionHandling");
        FilenameFilter filter = (dir, name) -> name.startsWith("F");
        File[] files = folder.listFiles(filter);
        for (File file : files) {
            System.out.println(file.getName() + "\t" + file.length() + "\t" + file.canWrite());
        }
    }
}
