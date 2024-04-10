package StreamAPIOptionalClassParallelSort;

import java.util.*;

public class QA {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(50);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(10);
        list.add(5);
        list.add(45);
        list.add(45);
        //with the help of stream api, find out even odd numbers.
        list.stream().filter(x->x%2==0).forEach(System.out::println);
        list.stream().filter(x->x%2!=0).forEach(System.out::println);
        //more than or equal to 5. ------filter
        System.out.println("---------");
        list.stream().filter(x->x>=15).forEach(System.out::println);
        // add 10 to individual element
        System.out.println("---------");
        list.stream().map(x->x+10).forEach(System.out::println);
        //multiply by 2 in individual element
        System.out.println("---------");
        list.stream().map(x->x*2).forEach(System.out::println);
        //find out the count
        System.out.println("---------");
        long count = list.stream().count();
        System.out.println(count);
        //find out the sum
        System.out.println("---------");
        int sum = list.stream().mapToInt(x->x.intValue()).sum();
        System.out.println(sum);
        //Minimum element, Max
        System.out.println("---------");
        Optional<Integer> min = list.stream().min((v1,v2)-> v1.compareTo(v2));
        System.out.println(min.get());
        Optional<Integer> max = list.stream().max((v1,v2)-> v1.compareTo(v2));
        System.out.println(max.get());
        //Sorting
        System.out.println("---------");
        list.stream().sorted().forEach(System.out::println);
        //duplicate, unique elements
        System.out.println("---------");
        list.stream().distinct().forEach(System.out::println);
        //find out the third highest, third lowest
        System.out.println("---------");
        int thirdlow = list.stream().distinct()
                .sorted()
                .skip(2)
                .findFirst().get();
        System.out.println(thirdlow);

        int thirdhigh = list.stream()
                .distinct()
                .sorted(Collections.reverseOrder())
                .skip(2)
                .findFirst().get();
        System.out.println(thirdhigh);



    }
}
