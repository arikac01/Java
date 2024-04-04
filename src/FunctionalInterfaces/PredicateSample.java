package FunctionalInterfaces;

import java.util.List;
import java.util.function.Predicate;

public class PredicateSample {
    public static void main(String[] args) {
        Predicate<Integer> isFan = i -> {
            if(i>25){
                return true;
            }
            else {
                return false;
            }
        };
        Predicate<Integer> isEven = (Integer val) -> {
            if (val%2==0){
                return true;
            }
            else {
                return false;
            }
        };
        System.out.println(isEven.test(19));
        System.out.println("Using test method - fan status: "+ isFan.test(10));
    }
}
/*
-> It is a pre-defined functional interface
-> It represents a predicate (boolean-valued function) of one argument.
-> Predicate<T>    - It accepts any type of object
-> It returns boolean
-> boolean test(T obj) is the method in predicate interface
-> it have 3 default methods and 2 static methods
-> and(), or(), negate() are default methods
-> not(), equals() are static methods
-> filter() always accepts only predicates.
 */

