package Week3.Day3;

public class LambdaExpression {

    @FunctionalInterface
    interface Greeting{
        void sayHello();
    }

    @FunctionalInterface
    interface Square{
        int findSquare(int number);
    }

    public static void main(String[] args){

        Greeting greeting = () -> {
            System.out.println("Hello World");
        };

        greeting.sayHello();


        Square square = number -> number * number;

        System.out.println(square.findSquare(5));

    }

}
