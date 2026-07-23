package Week3.Day4;

import java.util.Arrays;
import java.util.List;

public class DistinctMethodExample {

    public static void main(String[] args){
        List<String> names = Arrays.asList("Ahmad", "Ali", "Ahmad", "Ayesha");
        names.stream().distinct().forEach(System.out::println);
    }

}
