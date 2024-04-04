package Exceptions;

import java.util.Scanner;

/* We can use throws Exception class or Throwable class to let Java handle the exception
* instead of giving multiple exception names.*/
public class TryWithResource {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Hello, " + name + "!");
        }
    }
}

/* Why Try with Resource?
* if we have multiple file operations that should be closed at the end,
* instead of writing .close for every open operation,
* we can use this try with resource.
* If we leave the operations open, it might give us a warning for
* leak.
* With Try-with-Resource, we can pass the operations open to try block as parameters
* but these are not parameters. these are resources.
* Parameters should be passed with values, but here we pass instance created ones.
* ->With this concept, Java automatically closes the operations open mentioned in try block.
* ->we cant add all kind of operations in try with resource block.
* ->We can only add that are under AutoCloseable class.
*
* Advantage - Helps with security and memory leakage problems.*/

