package Collections;

import java.util.LinkedHashSet;

/*

Ordered Collection: LinkedHashSet maintains the order of elements as they are inserted.

Unique Elements: Like other set implementations, LinkedHashSet does not allow duplicate
elements.

Performance: Offers constant-time performance for basic operations (add, remove, contains)
because it uses hashing for storage.

Backed by HashTable: Internally, LinkedHashSet is backed by a hash table,
combining the features of a hash table and a linked list to maintain insertion order.

 */

public class LinkedHashSetSample {
    public static void main(String[] args) {
        // Create a LinkedHashSet
        LinkedHashSet<String> fruitSet = new LinkedHashSet<>();

        // Add fruits to the set
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Orange");

        // Display the set
        System.out.println("Fruits in the set: " + fruitSet);

        // Get the size of the set
        int size = fruitSet.size();
        System.out.println("Size of the set: " + size);

        // Check if the set is empty
        boolean isEmpty = fruitSet.isEmpty();
        System.out.println("Is the set empty? " + isEmpty);

        // Clear the set
        fruitSet.clear();
        System.out.println("After clearing the set: " + fruitSet);
    }
}
