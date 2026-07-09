public class AritmeticOperators  {

    public
    static int a = 100;
    static int b = 20;

    public static void add(){
        int result = a+b;
        System.out.println("Sum of a and b is : " + result);
    }

    public static void sub(){
        int result = a-b;
        System.out.println("Sum of a and b is : " + result);
    }

    public static void mul(){
        int result = a*b;
        System.out.println("Product of a and b is : " + result);
    }

    public static void div(){
        int result = a/b;
        System.out.println("Divison of a and b is : " + result);
    }

    public static void main(String[] args){
        add();
        sub();
        mul();
        div();
    }

}
