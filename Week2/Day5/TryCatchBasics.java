package Week2.Day5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchBasics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int secondNumber = sc.nextInt();

        try {
            int result = firstNumber / secondNumber;
            System.out.println("Result is : " + result);
        }catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }catch (InputMismatchException e) {
            System.out.println("Only Integers are accepted");
        }

        sc.close();
    }

}

