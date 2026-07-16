public class ArraysBasics {

    public static void main(String[] args){
        //1D Array
        int [] a;
        //2D Array
        int [][] b;

        //Initialization
        b = new int[3][3];
        a= new int[3];

        //Printing 1D Array
        for (int i = 0; i < 3; i++) {
            a[i] = 10;
            System.out.println(a[i]);
        }

        //Printing 2D Array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j]=20;
                System.out.print(b[i][j] + " ");
            }
            System.out.println();

        }
    }

}