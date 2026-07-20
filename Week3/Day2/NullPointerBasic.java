package Week3.Day2;

public class NullPointerBasic {

    static class Student{
        String name;

        Student(String name){
            this.name = name;
        }

        public static void main(String[] args){
            Student student = null;
            System.out.println(student.name);
        }

    }

}
