package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileDemo {

    public static void main(String[] args) throws IOException {
        String fileName = "test.txt";
        // /Users/milosgarunovic/IdeaProjects/untitled1/test.txt
        String str = "Hello";

        Path path = Paths.get(fileName); // path on the filesystem

//        Files.write(path, str.getBytes());

        List<String> read = Files.readAllLines(path);
        for (String s : read) {
            System.out.println(s);
        }
    }

}
