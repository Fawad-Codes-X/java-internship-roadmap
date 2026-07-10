import java.util.Arrays;

public class MoveZeroToEnd {

    public static void moveZeros(int[] num) {

        int position = 0;


        for (int i = 0; i < num.length; i++) {

            if (num[i] != 0) {


                if (i != position) {
                    int temp = num[i];
                    num[i] = num[position];
                    num[position] = temp;
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