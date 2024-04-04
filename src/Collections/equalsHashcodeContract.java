package Collections;

public class equalsHashcodeContract {
    private int id;

    // Constructor
    public equalsHashcodeContract(int id) {
        this.id = id;
    }

    // Override equals() method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Same reference, objects are equal
        if (obj == null || getClass() != obj.getClass()) return false; // Different types or null, objects are not equal
        equalsHashcodeContract other = (equalsHashcodeContract) obj; // Type casting
        return id == other.id; // Equality based on id
    }

    // Override hashCode() method
    @Override
    public int hashCode() {
        return id; // Use id as hashCode
    }

    public static void main(String[] args) {
        equalsHashcodeContract obj1 = new equalsHashcodeContract(1);
        equalsHashcodeContract obj2 = new equalsHashcodeContract(1);

        // Testing equals() method
        System.out.println("Equals: " + obj1.equals(obj2)); // Output: true

        // Testing hashCode() method
        System.out.println("HashCode - obj1: " + obj1.hashCode()); // Output: Same hashCode value
        System.out.println("HashCode - obj2: " + obj2.hashCode()); // Output: Same hashCode value
    }
}

/*

->Internal working of Hashmap - theory

->Hashcode equals contract - program
---------------------------------------------------------------------------------------

What is Hashing?
It is the process of converting an object into an integer value.
The integer value helps in indexing and faster searches.

What is HashMap?
HashMap is a part of the Java collection framework.
It uses a technique called Hashing. It implements the map interface.
It stores the data in the pair of Key and Value.
HashMap contains an array of the nodes, and the node is represented as a class.
It uses an array and LinkedList data structure internally for storing Key and Value.



--> equals(): It checks the equality of two objects.
It compares the Key, whether they are equal or not.
It is a method of the Object class. It can be overridden.
If you override the equals() method, then it is mandatory to override the hashCode() method.

--> hashCode(): This is the method of the object class.
It returns the memory reference of the object in integer form.
The value received from the method is used as the bucket number.
The bucket number is the address of the element inside the map.
Hash code of null Key is 0.

--> Buckets: Array of the node is called buckets.
Each node has a data structure like a LinkedList.
More than one node can share the same bucket. It may be different in capacity.

Calculating Index: Index = hashcode(Key) & (n-1)
Hash Collision
This is the case when the calculated index value is the same for two or more Keys.
In this case, equals() method check that both Keys are equal or not.
If Keys are same, replace the value with the current value.
Otherwise, connect this node object to the existing node object through the LinkedList.

.equals() Contract:
reflexive: an object must equal itself -> a.equals(a) should return true.
symmetric: x.equals(y) must return the same result as y.equals(x)
transitive: if x.equals(y) and y.equals(z), then also x.equals(z)
consistent: the value of .equals()
should change only if a property that is contained in .equals() changes


.hashcode() contract:
internal consistency: the value of hashCode() may only change
if a property that is in equals() changes
equals consistency: objects that are equal to each other must return the same hashCode
collisions: unequal objects may have the same hashCode


 */
