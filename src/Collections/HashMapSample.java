package Collections;
import java.util.*;
public class HashMapSample {
    /* Note:
    Java HashMap contains values based on the key.
    It contains only unique keys.
    It may have one null key and multiple null values.
    It is non synchronized and maintains no order.
    The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
     */

    public static void main(String args[]) {
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        map.put(103, "Gaurav");
        map.put(103, "Pavan");
        map.put(null, "vikas"); //adding one null key
        map.put(null, "Vishnu"); //adding one more null key
        map.put(106, null); //adding null values
        map.put(107, null); //adding null values
        map.put(108, null); //adding null values
        map.put(106, "Name"); //Updating/Reassigning values for Null
        System.out.println("Initial list of elements: "+map);
        //key-based removal
        map.remove(100);
        System.out.println("Updated list of elements: "+map);
        //key-value pair based removal
        map.remove(102, "Rahul");
        System.out.println("Updated list of elements: "+map);
    }
}

