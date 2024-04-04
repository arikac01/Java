package Collections;

    /*

    A LinkedHashMap in Java is a data structure that extends the functionality
    of HashMap by maintaining a predictable iteration order.

    It stores key-value pairs and allows fast retrieval of values based on keys.

    LinkedHashMap maintains the order of elements based on the insertion order or
    access order, depending on the constructor used.

    It handles collisions using chaining, similar to HashMap.

    LinkedHashMap is not synchronized by default, but it can be made
    synchronized using the Collections.synchronizedMap() method.

    Like HashMap, LinkedHashMap does not allow duplicate keys,
    but it does allow null keys and null values.

    Overall, LinkedHashMap is commonly used when iteration order is important,
    such as maintaining the order of elements based on their insertion or access sequence.

     */

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapSample {
    public static void main(String[] args) {
        // Create a LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Adding elements to the LinkedHashMap
        linkedHashMap.put("Apple", 10);
        linkedHashMap.put("Banana", 20);
        linkedHashMap.put("Orange", 15);

        // Displaying the elements
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // Getting the value associated with key "Banana"
        int value = linkedHashMap.get("Banana");
        System.out.println("Value associated with key 'Banana': " + value);
    }
}

