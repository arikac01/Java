package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Exceptions are unexpected events that are occurred and can be recovered.
* When we get an exception and the program terminates abnormally,
* We can handle the exception occurred.
*
* exceptions can be handled in below ways.
* -> Polymorphism
* -> Series of Catch blocks
* -> multiple exceptions catch block
*
*               Exceptions have two types:
* -> Checked Exception - requires programmers to handle it.
* -->The exceptions are checked at compile time.
* -->It have two types - Fully Checked, Partially checked.
* -->For fully checked exceptions, its all classes are checked,
* -->For Partially checked, few classes are not checked.
*
* -> Unchecked Exception(Run time errors too) - doesn't require programmers to handle it.
* -->These exceptions occur during run time and are not checked at compile time.
* -->These kind of exceptions mostly occur because of logical errors.
* -->We can consider exceptions under Error and RuntimeException classes are unchecked exceptions.
* -->Runtime errors such as NullPointException, ArithematicException, ArrayIndexOfBoundOutException comes
* under these unchecked and remaining all comes under checked.
*
* Both Exceptions and Errors are subclass of throwable class which is subclass of object class
* The 3 main blocks use to handle an exception are:
*
* ->Try block - we try the code and if any exception comes from the code
* with in this try block can be caught by a catch block.
* There should not be any line written between the try and catch blocks.
*
* ->Catch block - If we have the exception that is occurring, we can use the name of the exception
* to catch it. In general, we can use Exception key word to catch the occurred events.
*
* ->Finally block - The statements written in this block are definitely executed.
* Irrespective of the exception being handled or not.
* We can generally write clean up code in this block.
*
*
* Java covers most of the exceptions with built-in, but according to the requirements
* we might need custom exceptions.
*           Steps to create Custom/User-defined Exceptions:
* ->We have to create a class that extends Exception class.
* ->Define the exception with in the class
* ->Using throws, add the exception class name to method signature
* in which method the exception should be used.
* ->Use throw in the block instantiating it with object for exception class.
*
*               Differences between Final, Finalize, Finally
* ->Final is a method that cannot be overridden, or a class that cannot be extended.
-> finally is a block of code that is always executed,
* regardless of whether an exception is thrown or not.
* It is typically used to clean up resources, such as closing files or database connections.
-> finalize is a method that is called by the garbage collector before an object is destroyed.
* It can be used to perform any necessary cleanup before the object is removed from memory.
*
*               Differences between Throw and Throws
* Syntax:
* ->throw is followed by an exception instance.
* ->throws is followed by exception class names.
* Declaration:
* ->throw is used within the method.
* ->throws is used with the method signature.
* Internal implementation:
* ->throw can only throw one exception at a time.
* ->throws can declare multiple exceptions.
* Usage:
* ->throw is used to explicitly throw an exception.
* ->throws is used to declare that a method might throw an exception.
*
*
* propagation??
* throw propagates unchecked, throws propagate both checked and unchecked
*
* */
public class SeriesOfCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x/y;

            System.out.println("result: " + z);
        }
        catch(ArithmeticException e) {
            System.out.println("You can't divide by zero!");
        }
        catch(InputMismatchException e) {
            System.out.println("PLEASE ENTER A NUMBER!!!");
        }
        catch(Exception e) {
            System.out.println("Something went wrong");
        }
        finally {
            scanner.close();
        }
    }
}
