public class ArrayAverage {

    public static void main(String[] args){
        int [] marks = {10, 20,30,40,50};
        int sum = 0;
        int count = marks.length;

        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }

        double result = sum / count;
        System.out.println(result);
    }

}