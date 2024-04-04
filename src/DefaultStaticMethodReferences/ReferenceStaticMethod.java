package DefaultStaticMethodReferences;

import java.util.function.Function;

public class ReferenceStaticMethod {
    public static void main(String[] args) {
        // Lambda expression to convert a string to uppercase
        Function<String, String> toUpperCaseLambda = s -> s.toUpperCase();

        // Method reference to the static method String::toUpperCase
        Function<String, String> toUpperCaseReference = String::toUpperCase;

        // Test the lambda expression
        String resultLambda = toUpperCaseLambda.apply("hello");
        System.out.println("Result using lambda expression: " + resultLambda); // Output: HELLO

        // Test the method reference
        String resultReference = toUpperCaseReference.apply("hello");
        System.out.println("Result using method reference: " + resultReference); // Output: HELLO
    }
}
