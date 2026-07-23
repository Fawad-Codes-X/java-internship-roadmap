package Week3.Day4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectToMapExample {

    public static class Student{
        int id;
        String name;

        Student(int id, String name){
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String[] args){
        List<Student> students = Arrays.asList(
                new Student(1,"Ali"),
                new Student(2,"Ahmad"),
                new Student(3,"Sara")
        );

        Map<Integer, String> studentMap = students.stream()
                .collect(Collectors.toMap(
                    student -> student.id,
                        student -> student.name
                ));

        System.out.println(studentMap);
    }

}
