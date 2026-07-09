import java.util.Scanner;

public class ConsoleBasedCalculator {

    double firstNumber;
    double secondNumber;
    double result;
    int userOption;

    Scanner sc = new Scanner(System.in);

    
    public void showMenu() {
        System.out.println("\n========= Calculator =========");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }


    public void performCalculation() {

        userOption = sc.nextInt();


        if (userOption == 5) {
            System.out.println("Thank you for using the calculator!");
            return;
        }


        if (userOption < 1 || userOption > 5) {
            System.out.println("Invalid Choice!");
            return;
        }


        System.out.print("Enter First Number: ");
        firstNumber = sc.nextDouble();

        System.out.print("Enter Second Number: ");
        secondNumber = sc.nextDouble();

        switch (userOption) {

            case 1:
                result = firstNumber + secondNumber;
                System.out.println("Result: " + result);
                break;

            case 2:
                result = firstNumber - secondNumber;
                System.out.println("Result: " + result);
                break;

            case 3:
                result = firstNumber * secondNumber;
                System.out.println("Result: " + result);
                break;

            case 4:
                if (secondNumber == 0) {
                    System.out.println("Cannot divide by zero!");
                    break;
                }

                result = firstNumber / secondNumber;
                System.out.println("Result: " + result);
                break;
        }
    }

    public static void main(String[] args) {

        ConsoleBasedCalculator obj = new ConsoleBasedCalculator();

        do {

            obj.showMenu();
            obj.performCalculation();

        } while (obj.userOption != 5);

    }
}