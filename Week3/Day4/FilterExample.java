package Week3.Day4;

import java.util.List;

public class FilterExample {

    public static void main(String[] args){
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8);
        numbers.stream().filter(n -> n % 2==0).forEach(System.out::println);
    }

}
