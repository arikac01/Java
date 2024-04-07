package StreamAPIOptionalClassParallelSort;

import java.util.Arrays;

public class StreamApiForEach {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 10, 45, 23, 90};
        Arrays.stream(a).forEach(
                System.out::println
        );

        System.out.println("Count: "+Arrays.stream(a).count());
        Arrays.stream(a).filter(e -> (e%2 == 0)).forEach(e -> System.out.println(e));
        System.out.println("----------------------------");
        Arrays.stream(a).filter(e -> (e%2 != 0)).forEach(e -> System.out.println(e));
        System.out.println("----------------------------");
        Arrays.stream(a).filter(e -> (e>30)).forEach(System.out::println);

    }
}
