package Collections;

import java.util.Vector;

public class VectorSample {
    public static void main(String[] args) {
        // Creating a Vector
        Vector<String> vector = new Vector<>();

        // Adding elements to the Vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");
        vector.add("Grapes");

        // Displaying the Vector
        System.out.println("Vector elements: " + vector);

        // Removing an element
        vector.remove("Banana");
        System.out.println("After removing 'Banana': " + vector);

        // Checking if the Vector contains an element
        if (vector.contains("Banana")) {
            System.out.println("'Banana' is present in the Vector.");
        } else {
            System.out.println("'Banana' is not present in the Vector.");
        }
    }
}

/*
Thread-Safe: Unlike ArrayList, Vector is synchronized, making it thread-safe.

Dynamic Size: Vector automatically increases its capacity as needed when elements are added.

Ordered Collection: Vector maintains the order of elements as they are inserted.

Similar to ArrayList: Vector is similar to ArrayList but with synchronized methods,
leading to slower performance in multi-threaded scenarios.

Legacy Class: While Vector is still part of the Java Collections Framework,
it is considered a legacy class, and ArrayList is typically preferred
for new development due to its better performance in most scenarios.
 */