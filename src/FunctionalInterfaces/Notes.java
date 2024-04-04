package FunctionalInterfaces;

public class Notes {

    // before and after Java 8 - 5 functional interfaces
    //Functional interface, Lambda Expression.
}
/*

Functional Interface:
->A interface that have only one abstract method which is also called as SAM(Single Abstract Method)
-> It can have multiple default and static methods in the interface
-> It is a good practice to write @FunctionalInterface annotation to avoid multiple
abstract methods written in it.
->Java have pre-built Functional interfaces, and we can also create custom ones.

Lambda Expression:
->Lambda Expression is a new feature in Java 8 and is used to write implementation of
Functional interfaces.
->It is clear and concise way to represent one method interface using an expression.
->It saves lots of code
->It is treated as a Function
->It is also very useful in collection library to help iterate, filter and extract data from collection.
-> ()  -> {};
-> Parameters, expression, Body;
-> no need to pass data types to parameters


Before Java 8, we have few Functional interfaces such as:
-> Runnable
->Callable
->Comparable
->Comparator
->ActionListener

After Java 8, we have few of the below Functional interfaces:
->Predicate
->Consumer
->Supplier
->Function
->Unary
 */