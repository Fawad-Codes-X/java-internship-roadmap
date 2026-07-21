package Week3.Day2;

public class BugFixTask {

    public static void main(String[] args){

        String name = null;
//          BUG Example 1
//        System.out.println(name);
//          Fix
        if(name != null){
            System.out.println("Length : " + name.length());
        }else{
            System.out.println("Name is null");
        }

    }

}
