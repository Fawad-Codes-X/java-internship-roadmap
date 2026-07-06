import java.util.Scanner;

public class InputFromConsole {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name = sc.nextLine();

        System.out.println("Enter Your Age : ");
        int age = sc.nextInt();

        System.out.println("Your name is " + name);

        System.out.println("Your age is : " + age);

        sc.close();
    }
}