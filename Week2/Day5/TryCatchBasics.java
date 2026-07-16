package Week2.Day5;

import java.util.Scanner;

public class TryCatchBasics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int secondNumber = sc.nextInt();

        int result = firstNumber / secondNumber;

        System.out.println("Result is : " + result);
        sc.close();
    }

}

