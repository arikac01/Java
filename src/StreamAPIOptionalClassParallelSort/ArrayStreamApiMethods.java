package StreamAPIOptionalClassParallelSort;

import java.util.Arrays;
import java.util.OptionalDouble;

public class ArrayStreamApiMethods {
    public static void main(String[] args) {
        int[] a = {10, 20, 20, 30, 40, 1, 4};
        int sum = Arrays.stream(a).sum();
        System.out.println(sum);

        OptionalDouble avg = Arrays.stream(a).average();
        System.out.println(avg.getAsDouble());

        int min = Arrays.stream(a).min().getAsInt();
        System.out.println("Min: "+min);

        int max = Arrays.stream(a).max().getAsInt();
        System.out.println("Max: "+ max);

        boolean flag = Arrays.stream(a).isParallel();
        System.out.println(flag);

        boolean flags = Arrays.stream(a).parallel().isParallel();
        System.out.println(flags);
    }
}
