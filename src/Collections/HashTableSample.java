package Collections;

import java.util.Hashtable;

/*

A Hashtable in Java efficiently stores key-value pairs.

It provides fast retrieval of values based on keys using hashing.

Hashtable handles collisions using chaining, where multiple key-value pairs are
stored in linked lists at hash bucket locations.

Hashtable is synchronized, making it suitable for use in multi-threaded environments.

It does not support random access, allowing elements to be accessed only by their keys.

Hashtable does not allow duplicate keys and does not maintain insertion order.

Additionally, it does not allow null keys or values.

Overall, Hashtable is commonly used for caching, data storage, and
implementing associative arrays due to its efficient lookup and retrieval operations.

 */

public class HashTableSample {
    public static void main(String[] args) {
        // Create a Hashtable
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        // Add key-value pairs to the Hashtable
        hashtable.put(1, "Apple");
        hashtable.put(2, "Banana");
        hashtable.put(3, "Orange");

        // Display the Hashtable
        System.out.println("Hashtable: " + hashtable);

        // Get the value associated with key 2
        String value = hashtable.get(2);
        System.out.println("Value associated with key 2: " + value);

        // Remove the entry with key 1
        hashtable.remove(1);
        System.out.println("After removing key 1: " + hashtable);

        // Check if the Hashtable contains key 3
        boolean containsKey = hashtable.containsKey(3);
        System.out.println("Does the Hashtable contain key 3? " + containsKey);

        // Check if the Hashtable is empty
        boolean isEmpty = hashtable.isEmpty();
        System.out.println("Is the Hashtable empty? " + isEmpty);

        // Get the size of the Hashtable
        int size = hashtable.size();
        System.out.println("Size of the Hashtable: " + size);

        // Clear the Hashtable
        hashtable.clear();
        System.out.println("After clearing the Hashtable: " + hashtable);
    }
}

