public class MinimumElement {


    public static void main(String[] args){

        int [] num = {20,30,15,40,60,80,90};
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if(num[i] < min){
                min = num[i];
            }
        }

        System.out.println("Minimum Number : " + min);

    }

}