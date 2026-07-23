package Week3.Day4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {

    public static class Student{
        String grade;
        String name;

        Student(String grade, String name){
            this.grade = grade;
            this.name = name;
        }

        @Override
        public String toString(){
            return name;
        }

    }

    public static void main(String[] args){

        List<Student> students = Arrays.asList(
                new Student("A", "Ali"),
                new Student("B", "Ahmad"),
                new Student("C", "Sara")
        );

        Map<String, List<Student>> result = students.stream()
                .collect(Collectors.groupingBy(student -> student.grade));

        System.out.println(result);

    }

}
