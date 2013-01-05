package junit.tutorial;

import java.io.File;
import java.io.IOException;

public class TemporaryFolderExample {
    public static void mkDefaultFiles(File folder) throws IOException {
        File file1 = new File(folder, "UnitTest");
        file1.createNewFile();

        File file2 = new File(folder, "readme.txt");
        file2.createNewFile();
    }
}
