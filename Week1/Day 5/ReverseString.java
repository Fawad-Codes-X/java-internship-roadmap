public class ReverseString {

    public void revString(String str) {

        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        System.out.println(reversed);
    }

    public static void main(String[] args) {

        ReverseString obj = new ReverseString();
        obj.revString("Hello");

    }
}