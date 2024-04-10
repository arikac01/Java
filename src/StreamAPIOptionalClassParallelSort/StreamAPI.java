package StreamAPIOptionalClassParallelSort;
import java.util.*;

import static java.lang.Integer.sum;

public class StreamAPI {
    public static void main(String[] args) {
        // Create a list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, (e,i) -> sum(e,i));//Integer::sum (Method References)

        System.out.println("Result: " + result);
    }
}
/*
-> .forEach() input argument is consumer
-> .generate() takes suppliers as their inputs arguments
-> filter() always accepts only predicates.
-> map takes function interface as input.

____> Sequential Stream: by using Arrays.stream() or CollectObj.stream()

to see if a stream is sequential or not, we use isParallel() method
returns boolean, false ->> stream is Sequential, true ->> Stream is Parallel.

______> Collections will support Objects not primitive

        Primitives -> Wrapper class -> Objects ->Collection
        collectionObj.stream() -> sequential
        collectionObj.parallelstream() -> parallel


 */
