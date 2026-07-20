package Week3.Day1;

import java.util.*;
public class TypeErasure {
    public static void main(String[] args){
       List list = new ArrayList();
       list.add("Hello World");
       String s;
       for(Iterator iter = list.iterator(); iter.hasNext();){
            s = (String) iter.next();
           System.out.println(s);
       }
    }
}
