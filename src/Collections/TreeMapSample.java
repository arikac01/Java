package Collections;
import java.util.*;
public class TreeMapSample {
    /* Note:
    Java TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
    It contains only unique elements.
    It cannot have a null key but can have multiple null values.
    It is non synchronized and maintains ascending order.
     */

    public static void main(String args[]){
        TreeMap<Integer,String> map=new TreeMap<Integer,String>();
        map.put(100,"Amit");
        map.put(102,"Ravi");
        map.put(101,"Vijay");
        map.put(103,"Rahul");

        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
