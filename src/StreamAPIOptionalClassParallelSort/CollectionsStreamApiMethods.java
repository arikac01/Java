package StreamAPIOptionalClassParallelSort;

import java.util.*;

public class CollectionsStreamApiMethods {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("c");
        list.add("e");
        list.add("f");
        list.add("d");
        list.add("c");
        list.add(null);
        list.stream().filter(x -> x!=null).forEach(System.out::println);//remove null
        System.out.println("--------------------------------------");
        list.stream().distinct().forEach(System.out::println);//removes duplicates
        System.out.println("--------------------------------------");
        list.stream().distinct().filter(x->x!=null).forEach(System.out::println);//both null, duplicates
        System.out.println("--------------------------------------");
        list.stream().distinct().filter(x->x!=null).sorted().forEach(System.out::println);//sort
        System.out.println("--------------------------------------");
        list.stream().distinct().filter(x->x!=null).map(y->y.toUpperCase()).sorted().forEach(System.out::println);
        System.out.println("--------------------------------------");
        //limit() will take size as i/p
        //limit(2) --> returns stream which contains 2 elements
        list.stream().limit(2).forEach(System.out::println);
        System.out.println("--------------------------------------");
        //skip() will take size as i/p
        //skip(2) --> return new stream by skipping first 2 elements
        list.stream().skip(2).forEach(System.out::println);
        System.out.println("--------------------------------------");
        list.stream().skip(2).limit(2).forEach(System.out::println);



    }
}
