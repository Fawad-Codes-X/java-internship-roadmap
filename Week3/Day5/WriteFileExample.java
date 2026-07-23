package Week3.Day5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class WriteFileExample {

    public static void main(String[] args) throws IOException {

        List<String> students = Arrays.asList(
                "Stacey Odom",
                "Wm Marks",
                "Mariana Ewing"
        );

        Files.write(Path.of("C:\\Users\\PMYLS\\Desktop\\java-internship-roadmap\\Week3\\Day5\\students.txt"), students);
        System.out.println("File Written Successfully");

    }

}
