package Week3.Day3;

public class CalculatorClass {

    @FunctionalInterface
    interface CalculatorOperation{
        double calculate(double a , double b);
    }

    public static void main(String[] args){

        CalculatorOperation add = (a,b) -> a + b;


        CalculatorOperation subtract = (a,b) -> a - b;

        CalculatorOperation multiply = (a, b) -> a * b;

        CalculatorOperation division = (a,b) -> {
            if(b==0){
                System.out.println("Cannot Divide By Zero.");
                return 0;
            }
            return a /b;
        };

        System.out.println("Addition : " + add.calculate(10, 20));
        System.out.println("Subtraction : " + subtract.calculate(40,20));
        System.out.println("Multiplication : " + multiply.calculate(10, 20));
        System.out.println("Division : " + division.calculate(40, 2));

    }

}
