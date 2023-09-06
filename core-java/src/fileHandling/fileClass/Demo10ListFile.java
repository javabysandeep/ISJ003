package fileHandling.fileClass;

import java.io.File;
import java.io.IOException;

public class Demo10ListFile {
    public static void main(String[] args) throws IOException {
      File folder = new File("src/exceptionHandling");
        File[] files = folder.listFiles();
        for (File file:files) {
            System.out.println(file.getName()+"\t"+file.length()+"\t"+file.canWrite());
        }
    }
}
