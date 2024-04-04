package FunctionalInterfaces;

import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
        Consumer<Integer> cons = (Integer val) -> {
            if(val>10) {
                System.out.println("Consuming!!");
            }
            else{
                System.out.println("Not consuming");
            }
        };
        cons.accept(10);
        cons.accept(23);
    }
}
/*
-> It is a predefined functional interface
-> It represents an operation that accepts a single argument and returns no result.
-> Consumer<T>  - accepts any type of object
-> it doesn't return anything
-> void accept(T obj);
-> one default method - andThen() where consumers can be chained.
-> .forEach() input argument is consumer
 */
