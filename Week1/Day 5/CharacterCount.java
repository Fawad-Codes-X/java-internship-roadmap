import java.util.Scanner;

public class CharacterCount {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        int totalCharacters = 0;
        int letters = 0;
        int digits = 0;


        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

                if (ch != ' ') {
                totalCharacters++;
            }

            if (Character.isLetter(ch)) {
                letters++;
            }


            if (Character.isDigit(ch)) {
                digits++;
            }
        }

        System.out.println("\nResult:");
        System.out.println("Total Characters (excluding spaces): " + totalCharacters);
        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);

        input.close();
    }
}