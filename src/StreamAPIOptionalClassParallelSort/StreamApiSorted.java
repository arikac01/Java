package StreamAPIOptionalClassParallelSort;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StreamApiSorted {
    public static void main(String[] args) {
        List<Integer> list = List.of(54,1,2,3,1,76,32, 25);
        list.stream().sorted().forEach(e -> System.out.println(e));

        long count = list.stream().count();
        System.out.println(count);

        List<String> stringList = List.of("ab","re", "sa","da","pa");
        List<String> sorted = stringList.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);
    }
}
