package Collections;

/*
i have one list with element 10, 5, 61, 5, 5, 7, 73, 24. Find unique element with the help of
Hashset, LInkedHashset, TreeSet.
 */

import java.util.Arrays;
import java.util.*;

public class UniqueElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 5, 61, 5, 5, 7, 73, 24);

        // Using HashSet to find unique elements
        Set<Integer> uniqueHashSet = new HashSet<>(list);
        //HashSet doesn't maintain insertion order and as it is set,
        //It doesn't allow duplicates and ignore them.
        System.out.println("Unique elements using HashSet: " + uniqueHashSet);

        // Using LinkedHashSet to preserve insertion order of unique elements
        Set<Integer> uniqueLinkedHashSet = new LinkedHashSet<>(list);
        //LinkedHashSet maintains insertion order
        System.out.println("Unique elements using LinkedHashSet: " + uniqueLinkedHashSet);

        // Using TreeSet to find unique elements in sorted order
        Set<Integer> uniqueTreeSet = new TreeSet<>(list);
        //TreeSet gives us Sorted list
        System.out.println("Unique elements using TreeSet: " + uniqueTreeSet);
        NavigableSet<Integer> descendingSet = ((TreeSet<Integer>) uniqueTreeSet).descendingSet();
        // Display unique elements in descending order
        System.out.println("Unique elements using TreeSet in descending order: " + descendingSet);
    }
}
