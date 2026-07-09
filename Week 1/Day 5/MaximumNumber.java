public class MaximumNumber {

    public static void main(String[] args){
        int [] arr = {20,40,30,12,17,80,87};
        int max = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum Number : " + max);
    }

}