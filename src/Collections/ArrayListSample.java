package Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class ArrayListSample{


    /* Note: ArrayList class implements the List interface.
    It uses a dynamic array to store the duplicate element of different data types.
    The ArrayList class maintains the insertion order and is non-synchronized.
    The elements stored in the ArrayList class can be randomly accessed.*/

    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        Vector<String> v = new Vector<>(2);
        v.add("element");
        v.add("da");
        v.add("oa");
        v.add("yu");
        v.add("duwi");
        v.add("hsds");
//Traversing list through Iterator
        Iterator itr=v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
