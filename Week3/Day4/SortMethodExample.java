package Week3.Day4;

import java.util.Comparator;
import java.util.List;

public class SortMethodExample {

    public static void main(String[] args){
        List<Integer> numbers = List.of(5,4,3,1,2,9,8);

        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }

}
