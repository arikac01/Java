package FunctionalInterfaces;

import java.util.function.Function;

public class FunctionSample {
    public static void main(String[] args) {
        Function<String, String> string = (String val1) -> {
            String output = val1.toUpperCase();
            return output;
        };
        System.out.println(string.apply("lola"));
    }
}
/*
->Function<T,R>
-> predefined
-> It represents a function that accepts one argument and returns a result.
-> R apply(T obj); -- abstract method
-> accepts any type of input and returns any type of object
-> 2 default methods - compose(), andThen()
-> 1 static method - identity();
-> map takes function interface as input.
 */
