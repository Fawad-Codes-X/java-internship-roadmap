import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class ParagraphWordCounter {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Your Paragraph : ");
        String paragraph = scanner.nextLine();

        paragraph = paragraph.toLowerCase();

        paragraph = paragraph.replaceAll("[^a-zA-Z0-9 ]", "");

        String[] words = paragraph.split("\\s+");

        HashMap<String, Integer> wordCount = new HashMap<>();


        for (String word : words) {


            if (word.isEmpty()) {
                continue;
            }

            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }


        System.out.println("\nWord Frequencies:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        scanner.close();

    }

}