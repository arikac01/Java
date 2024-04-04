package Collections;

public class StringAndStringBuffer {
    public static void main(String[] args) {
        String s1 = new String("Chandana");
        String s2 = new String("Chandana");
        System.out.println(s1 == s2); // Output: false
        System.out.println(s1.equals(s2)); // Output: true

        /*
        Explanation:

when you create a new String object using the new keyword,
it always creates a new object in the heap memory,
even if there's already a string with the same value in the string pool.
So, s1 and s2 are two different String objects, hence s1 == s2 evaluates to false.
However, when you use the equals() method, it compares the contents of the strings,
not their references.
Since the contents of s1 and s2 are the same ("Chandana"), s1.equals(s2) evaluates to true.


         */

        StringBuffer sb1 = new StringBuffer("Chandana");
        StringBuffer sb2 = new StringBuffer("Chandana");
        System.out.println(sb1 == sb2); // Output: false
        System.out.println(sb1.equals(sb2)); // Output: false

        /*

        Unlike String, the StringBuffer class does not override the equals() method from Object class,
 so sb1.equals(sb2) compares the references, which are different objects in this case.
 Hence, it returns false.
Similarly, sb1 == sb2 compares the references and returns false
because sb1 and sb2 are two different StringBuffer objects.
         */

        String sc = new String("Chandana");
        sc.concat("A N");
        System.out.println(sc); // Output: Chandana

        /*

        The concat() method in the String class does not modify the original string;
instead, it returns a new string that concatenates the specified string to
the end of the original string.
So, when s1.concat("A N") is called, it returns a new string ("ChandanaA N"),
but this new string is not assigned to any variable or used further.
Hence, s1 remains unchanged and still prints "Chandana".

         */

        StringBuffer sbc = new StringBuffer("Chandana");
       // sbc.concat("A N"); throws error
        //System.out.println(sbc); // Output: Cant find the symbol method concat
        sbc.append(" A N");
        System.out.println(sbc); //output: Chandana A N
        /*
Similar to the String class, the StringBuffer class modifies the original StringBuffer
object when using methods like append(). It does not return a new StringBuffer object.
So, when sb1.append("A N") is called, it modifies the original StringBuffer
object sb1 by appending "A N" to it. Hence, sb1 will print "Chandana A N".

         */
    }

}
