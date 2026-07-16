package Week2.Day4;

import java.util.HashMap;

public class HashMapImplementation {



    public static void main(String[] args){

        HashMap<String, Integer> country = new HashMap<>();
        country.put("Pakistan", 130);
        country.put("India", 90);

        country.put("China", 100);
        System.out.println(country);

        if(country.containsKey("China")){
            System.out.println("Key Exists in map...");
        }else {
            System.out.println("Key Doesn't Exist In The Map");
        }

    }

}