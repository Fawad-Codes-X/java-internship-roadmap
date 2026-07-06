public class TypeConversion{
    public static void main(String[] args){
        //Implicit Type Casting(Widening)
        int num = 100;
        long l = num;
        double d = l;
        System.out.println(d);

        //Explicit Type Conversion (Narrowing)
        double s = 999.99;
        int i = (int) s;
        System.out.println(i);

    }
}