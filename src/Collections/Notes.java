package Collections;

public class Notes {

    //differences between interfaces; 4-5 programs for child classes.

    //collection framework - difference btwn collection and array
//need of collection framework
//hierarchy of collections
//2-3 programs

    /* Collections in Java.
    It is a framework provided by Java
    -> It provides many interfaces and their implemented classes
    in order to store group of objects (elements) in a single entity.

    Differences Between Collection and Array
    1. -> Arrays can store multiple values
    ->Collections can store multiple values along with Key Value pair.

    2. -> Array has fixed size
    -> Collections are dynamic and need not specify size anywhere.

    3. ->Array holds only homogeneous elements
    -> Collections can hold both Homo and heterogeneous elements.

    4. -> Arrays hold both primitive and Object arrays
    -> Collections holds only Object arrays

    5. -> wrt memory arrays are not recommended to use
    -> Collections are highly recommended to use

    6. -> wrt performance, arrays are good.
    -> Collections are not recommended wrt performance.

    To overcome any disadvantages of Arrays, Collections are introduced.


            Collections Framework
            |
            Iterable Interface
            |
     ->Collection <interface>    ->> List, Set, Queue
     ->Map

     Classes that are  implementing interfaces above:
     List -->>  ArrayList, LinkedList, Vector, Stack
     Queue -->> ArrayQueue, PriorityQueue
     Set -->> HashSet, LinkedHashSet, TreeSet
     Map -->> HashTable, HashMap, LinkedHashMap, TreeMap


List:
-> Ordered Collection - aka sequence
-> allows duplicate elements
-> It can only contain Objects.
-> Maintains insertion order
-> Can add any number of null values
-> implementation classes are ArrayList, LinkedList
-> Complete control over where list items are placed in list.
-> access elements using index frequently then can use List.
-> Generic way to declare a List: List listOfStrings = new ArrayList();
-> List Methods: .add(), .size(), .get(), .set(), Foreach Loop, ListIterator to iterate.

Set:
-> Contains unique elements - no duplicates
-> it is not ordered list - which means it doesnt care about order of elements.
-> Maintains Insertion order
-> only one null value
-> Contain objects.
-> Default and widely used - HashSet
-> If you want Insertion order for elements - LinkedHashSet
-> If you want a sorted (natural ordering by default) elements - TreeSet
-> Iterator can be used to traverse the set elements

Queue:
->Works on FIFO principle
-> Most common types - LinkedList, PriorityQueue
-> addition method: add, addall, offer, offerFirst, OfferLast..
-> retrieve: peek
-> Deletion: Poll, remove
-> As a queue - operates of both ends being open - we specify first, last for methods.
-> enqueue() method will add an element at the back of the Queue.
-> dequeue() method will remove the item which is at the front of a given queue.

Map:
-> need key value pairs.
-> key must be unique - no duplicates
-> doesn't maintain any insertion order
-> allows a single null key, any number of null values
-> different implementations of Map are  - HashMap, TreeMap, LinkedHashMap, HashTable, concurrentHashMap
-> HashMap is common.
-> Map<Integer, String> sampleMap = new HashMap<>();  Integer of Key, String for Value.
-> Methods: Put the content in Map, Get content, Get the key set for Map  - use it to iterate.
-> Through KeySet, Value and EntrySet




     */
    // before and after Java 8 - 5 functional interface
//Functional interface, Lambda Expression.


































    /*

Set:

Randomly Accessible: No.
Stores Heterogeneous Data: Yes.
Insertion Order: Not maintained (depends on implementation).
Null Values: Typically allows one null value (if supported).
Duplicate Values: Not allowed.
Access Elements: No direct access by index. Use iterators or specific methods like contains().
Operations: Mainly set operations (e.g., add, remove, contains).
Performance: Depends on implementation, but typically optimized for fast lookup operations.
Examples: HashSet, TreeSet, LinkedHashSet.


List:

Randomly Accessible: Yes.
Stores Heterogeneous Data: Yes.
Insertion Order: Maintained.
Null Values: Allows null values.
Duplicate Values: Allows duplicate values.
Access Elements: Direct access by index using get() method.
Operations: List-specific operations like add, remove, get.
Performance: Depends on implementation. ArrayList provides fast random access, while LinkedList provides fast insertion and deletion.
Examples: ArrayList, LinkedList, Vector.


Queue:

Randomly Accessible: No.
Stores Heterogeneous Data: Yes.
Insertion Order: FIFO (First-In-First-Out) order.
Null Values: Typically allows one null value (if supported).
Duplicate Values: Allows duplicate values.
Access Elements: Typically dequeues elements from the front of the queue.
Operations: Queue-specific operations like offer, poll, peek.
Performance: Depends on implementation. ArrayDeque provides fast FIFO operations.
Examples: LinkedList, PriorityQueue, ArrayDeque.


Map:

Randomly Accessible: No (access by key).
Stores Heterogeneous Data: Yes (keys and values can be of different types).
Insertion Order: Not maintained (depends on implementation).
Null Values: Typically allows one null key (if supported) and multiple null values.
Duplicate Values: Not applicable (keys must be unique).
Access Elements: Access by key using get() method.
Operations: Map-specific operations like put, get, remove.
Performance: Depends on implementation. HashMap provides fast key-value lookup.
Examples: HashMap, TreeMap, LinkedHashMap.


-------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------

Differences in Implementations:

HashSet:

Duplicate Value Handling: Ignored.
Null Value Handling: Accepts one null value. (If added more than one, Just ignores)
Heterogeneous Data: Yes.
Operations: Set operations (add, remove, contains).
Random Accessibility: No.
Performance: Fast lookup due to hashing.
Underlying Data Structure: Hash table.


TreeSet:

Duplicate Value Handling: Ignored.
Null Value Handling: Throws NullPointerException.
Heterogeneous Data: Yes.
Operations: Set operations (add, remove, contains).
Random Accessibility: No.
Performance: Slower compared to HashSet due to tree-based storage.
Underlying Data Structure: Red-black tree.


ArrayList:

Duplicate Value Handling: Allowed.
Null Value Handling: Accepts null values.
Heterogeneous Data: Yes.
Operations: List operations (add, remove, get).
Random Accessibility: Yes.
Performance: Fast random access, slower insertion/removal at the beginning.
Underlying Data Structure: Dynamic array.


LinkedList:

Duplicate Value Handling: Allowed.
Null Value Handling: Accepts null values.
Heterogeneous Data: Yes.
Operations: List operations (add, remove, get).
Random Accessibility: No (linear access).
Performance: Fast insertion/deletion at both ends, slower random access.
Underlying Data Structure: Doubly linked list.


HashMap:

Duplicate Value Handling: Replaces existing value.
Null Value Handling: Accepts one null key and multiple null values.
Heterogeneous Data: Yes.
Operations: Map operations (put, get, remove).
Random Accessibility: No (access by key).
Performance: Fast key-value lookup.
Underlying Data Structure: Hash table.


TreeMap:

Duplicate Value Handling: Replaces existing value.
Null Value Handling: Throws NullPointerException.
Heterogeneous Data: Yes.
Operations: Map operations (put, get, remove).
Random Accessibility: No (access by key).
Performance: Slower compared to HashMap due to tree-based storage.
Underlying Data Structure: Red-black tree.

     */
}
