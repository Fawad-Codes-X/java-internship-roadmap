public class UserNameNormalization {


    static String normalizeUsername(String name) {


        String cleaned = name.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        StringBuilder username = new StringBuilder();

        for (int i = 0; i < cleaned.length(); i++) {

            username.append(cleaned.charAt(i));


            if ((i + 1) % 4 == 0 && i != cleaned.length() - 1) {
                username.append("_");
            }
        }

        return username.toString();
    }

    public static void main(String[] args) {

        String name = "Ali Raza-Khan";

        System.out.println("Original Name : " + name);
        System.out.println("Username      : " + normalizeUsername(name));
    }
}