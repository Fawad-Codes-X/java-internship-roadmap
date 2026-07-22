package Week3.Day3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BehaviourAsData {

    public static List<Integer> filterNumbers(List<Integer> numbers, Predicate<Integer> condition){

        List<Integer> result = new ArrayList<>();
        for(Integer num : numbers){
            if(condition.test(num)){
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args){

        List<Integer> dataList = List.of(1,2,3,4,5,6,7,8,9,10);

        //Behaviour as Lambda Expression
        List<Integer> evens= filterNumbers(dataList, n -> n % 2 == 0);

        //Pass Behaviour as alternate Lambda expression
        List<Integer> greaterthanFive = filterNumbers(dataList, n-> n > 5);

        //Behaviour as reference of Method
        List<Integer> odds = filterNumbers(dataList, BehaviourAsData::isOdd);

    }

    public static Boolean isOdd(int number){
        return number % 2!=0;
    }

}
