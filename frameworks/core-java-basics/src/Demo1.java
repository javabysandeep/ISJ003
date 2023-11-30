import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        for (int i = 65; i <= 100; i++) {
            fileOutputStream.write((char) i);
        }

        fileOutputStream.close();
    }
}
