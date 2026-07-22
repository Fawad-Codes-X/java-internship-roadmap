package Week3.Day3;

import java.util.function.Supplier;

public class FunctionalInterfaceExample {

    @FunctionalInterface
    interface Addition{
        int add(int a, int b);
    }

    public static void main(String[] args){

        Addition sum = (a,b) -> a+b;
        System.out.println("Sum : " + sum.add(10,20));

    }

}
