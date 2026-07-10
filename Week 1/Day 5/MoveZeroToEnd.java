import java.util.Arrays;

public class MoveZeroToEnd {

    public static void moveZeros(int[] arr) {

        int position = 0;


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {

                // Swap only when needed
                if (i != position) {
                    int temp = arr[i];
                    arr[i] = arr[position];
                    arr[position] = temp;
                }

                position++;
            }
        }
    }

    public static void main(String[] args) {

        int[] numbers = {0, 5, 0, 3, 12, 0, 8};

        System.out.println("Before:");
        System.out.println(Arrays.toString(numbers));

        moveZeros(numbers);

        System.out.println("After:");
        System.out.println(Arrays.toString(numbers));
    }
}