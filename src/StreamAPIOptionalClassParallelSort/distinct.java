package StreamAPIOptionalClassParallelSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class distinct {
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 1,3,3,3,5,8, 8, 9};
        Arrays.stream(a).sorted().distinct().forEach(System.out::println);

        List<String> list = new ArrayList<>();
        list.add("ram");
        list.add("sam");
        list.add("sam");
        list.add("tom");
        list.add("som");
        list.add("ram");
        list.add("tom");
        list.stream().sorted().distinct().forEach(System.out::println);
        long count = list.stream().count();
        System.out.println(count);
    }
}
