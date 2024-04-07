package StreamAPIOptionalClassParallelSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiCount {
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 8, 9};
        long count = Arrays.stream(a).count();
        System.out.println(count);

        List<String> nameList = new ArrayList<>();
        nameList.add("ram");
        nameList.add("sam");
        nameList.add("pam");
        nameList.add("tom");
        nameList.add("som");
        System.out.println(nameList.stream().count());
    }
}
