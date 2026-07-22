package Week3.Day4;

import java.util.List;

public class MapMethodExample {
    public static void main(String[] args){
        List<String> names = List.of("fawad", "ahmad");

        List<String> upperNames = names.stream().map(String::toUpperCase).toList();

        System.out.println(upperNames);

    }
}
