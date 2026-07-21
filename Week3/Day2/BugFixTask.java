package Week3.Day2;

public class BugFixTask {

    public class Student{
        private String name;

        public Student(String name){
            this.name = name;

        }

        public String getName(){
            return name;
        }
    }

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

//        Example 2

        Student student = null;
//          BUG
//        System.out.println(student.getName());

        if(student != null){
            System.out.println("Student Name : " + student.getName());
        } else {
            System.out.println("Student Object Is Null");
        }


    }

}
