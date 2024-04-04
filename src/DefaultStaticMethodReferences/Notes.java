package DefaultStaticMethodReferences;

public class Notes {

}
//default , static method - needs of these methods, Method references,
// diff between Method references and Lambda
// 2, 2, 3

/*
Problem:
In Java, interfaces could only declare method signatures but not provide any implementations.
This meant that if you added a new method to an existing interface,
all classes implementing that interface would be required to implement the new method,
potentially breaking existing code.

Solution with Default and Static Methods:

Default Methods:

-With default methods, you can now provide a default implementation
for a method directly within the interface.
-This allows you to add new methods to existing interfaces without forcing all
implementing classes to provide an implementation.
-Existing classes that do not override the default method will automatically inherit
the default implementation, ensuring backward compatibility.

Static Methods:

-Static methods in interfaces allow you to define utility methods that
can be directly accessed through the interface name.
-These methods are not inherited by implementing classes, so they do not affect
the class hierarchy or require implementation by implementing classes.
-They provide a convenient way to group related utility methods within
the interface itself, promoting code organization and reuse.
 */
