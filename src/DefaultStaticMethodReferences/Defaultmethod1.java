package DefaultStaticMethodReferences;

// Define an interface with a default method
interface MyInterface {
    default void sayHello() {
        System.out.println("Hello from MyInterface");
    }
}

// Implement the interface
class MyClass implements MyInterface {
    // No need to override the default method
}

// Main class to demonstrate the usage
public class Defaultmethod1 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.sayHello(); // Output: Hello from MyInterface
    }
}