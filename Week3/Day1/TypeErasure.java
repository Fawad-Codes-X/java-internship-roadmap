package Week3.Day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TypeErasure {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("Hello");
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()){
            String s = iter.next();
            System.out.println(s);
        }
    }
}
