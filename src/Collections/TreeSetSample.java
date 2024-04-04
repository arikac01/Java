package Collections;
import java.util.*;
public class TreeSetSample {
    /* Note:
    Java TreeSet class contains unique elements only like HashSet.
    Can access and retrieval times are quiet fast.
    it doesn't allow null element and is non synchronized.
    It maintains ascending order.
    it contains unique elements only like HashSet.
     */

    public static void main(String args[]) {
        TreeSet<String> set = new TreeSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ajay");
        set.add(null);// throws nullPointer exception
        System.out.println("Traversing element through Iterator in descending order");
        Iterator i = set.descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }

}
