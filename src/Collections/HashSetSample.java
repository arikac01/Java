package Collections;
import java.util.*;

public class HashSetSample {

    /* Note:
    HashSet stores the elements by using a mechanism called hashing.
    HashSet contains unique elements only and allows null value.
    HashSet class is non synchronized.
    HashSet doesn't maintain the insertion order.
    Here, elements are inserted on the basis of their hashcode.
    HashSet is the best approach for search operations.
    The initial default capacity of HashSet is 16, and the load factor is 0.75
     */

    public static void main(String args[]){
        //Creating HashSet and adding elements
        HashSet<String> set=new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("Three"); // ignores duplicates
        set.add(null);// adding null
        set.add("six");
        set.add(null);//adding null again
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
