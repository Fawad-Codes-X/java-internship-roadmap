package Week3.Day3;

public class LambdaExpression {

    @FunctionalInterface
    interface Greeting{
        void sayHello();
    }

    public static void main(String[] args){

        Greeting greeting = () -> {
            System.out.println("Hello World");
        };

        greeting.sayHello();

    }

}
