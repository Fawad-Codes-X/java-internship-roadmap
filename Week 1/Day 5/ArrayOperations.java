public class ArrayOperations
{
    int [] marks = {20,30,40,50,60};

    public void sumArray(){
        int sum = 0;
        for(int i = 0; i<marks.length; i++){
            sum = sum + marks[i];
        }

        System.out.println("Total Sum : " + sum);
    }

    public static void main(String[] args){

        ArrayOperations obj = new ArrayOperations();
        obj.sumArray();

    }


}