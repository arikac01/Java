package FunctionalInterfaces;

import java.util.function.Supplier;

public class SupplierSample {
    public static void main(String[] args) {
        Supplier<String> sup = () -> "Supplying!!";
        System.out.println(sup.get());
    }
}
/*
-> predefined
-> It represents a supplier of results.
-> T get();  - one abstract method in the functional interface
-> It doesn't take any input parameters
-> But it returns any type of object
-> .generate() takes suppliers as their inputs arguments
 */
