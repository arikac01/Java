package StreamAPIOptionalClassParallelSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionsTerminalStreamApi {
    public static void main(String[] args) {
        System.out.println("Terminal Operations");
        System.out.println("--------------------------------------");

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(12);
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(2);
        //reduce: it reduces data into single element
        System.out.println(list.stream().reduce((a,b)->a+b));
        System.out.println(list.stream().reduce((a,b)->a+b).get());
        Optional<Integer> reduce = list.stream().reduce((a,b)->a+b);
        System.out.println(reduce.get());
        long count = list.stream().count();
        System.out.println(count);

        list.stream().forEach(System.out::println);
        System.out.println("--------------------------------------");

        //toArray() is used to convert stream to array

        Object[] obj = list.stream().toArray();
        for (Object o:obj){
            System.out.println(o);
        }
        //max in arraylist

        Optional<Integer> max = list.stream().max((v1,v2)->v1.compareTo(v2));
        System.out.println("Max element: "+ max.get());

        Optional<Integer> min = list.stream().min((v1,v2)->v1.compareTo(v2));
        System.out.println("Min element: "+ min.get());

        //collect() is terminal operator which is used to convert stream into list/set/map back
        System.out.println(list.stream().distinct().collect(Collectors.toList()));
        System.out.println(list.stream().sorted().collect(Collectors.toSet()));
    }
}
