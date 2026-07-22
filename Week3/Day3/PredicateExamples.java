package Week3.Day3;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateExamples {
    public static void main(String[] args){
        //Predicate
        Predicate<Integer> isEven = number -> number % 2==0;

        //Function- Transformation
        Function<Integer, Integer> square = number -> number * number;

        //Consumer
        Consumer<Integer> print = number -> System.out.println("Number : " + number);

        //Supplier
        Supplier<String> greeting = () -> "Welcome TO Java Functional Interfaces";

        System.out.println(greeting.get());

        int number = 8;
        System.out.println(number + " is even ? " + isEven.test(number));

        int squareNumber = square.apply(number);

        print.accept(squareNumber);

    }

}
