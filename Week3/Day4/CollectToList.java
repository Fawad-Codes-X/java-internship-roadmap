package Week3.Day4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectToList {

    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(45, 50, 70, 78, 90);

        List<Integer> passed = marks.stream().filter(mark -> mark >= 50).collect(Collectors.toList());

        System.out.println(passed);
    }
}
