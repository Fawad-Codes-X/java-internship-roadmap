package Week3.Day5;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BufferedReaderExample {

    public static void main(String[] args) throws IOException{
        try(BufferedReader reader = Files.newBufferedReader(Path.of("C:\\Users\\PMYLS\\Desktop\\java-internship-roadmap\\Week3\\Day5\\students.txt"))){
            String line;

            while ((line = reader.readLine()) !=null){
                System.out.println(line);
            }

        }
    }

}
