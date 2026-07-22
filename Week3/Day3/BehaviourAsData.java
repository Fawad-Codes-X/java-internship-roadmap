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

    }

}
