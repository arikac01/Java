package FunctionalInterfaces;

import java.util.function.BiPredicate;

public class BiPredicateSample {

    public static void main(String[] args) {
        BiPredicate<String, Integer> fil = (x, y) -> {
          return x.length() == y;
        };
        System.out.println(fil.test("Java", 10));
        System.out.println(fil.test("Java", 4));
    }

}