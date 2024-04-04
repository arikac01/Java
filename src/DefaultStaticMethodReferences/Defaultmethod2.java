package DefaultStaticMethodReferences;

// Define an interface with a default method
interface MyInterface1 {
    default void sayHello() {
        System.out.println("Hello from MyInterface1");
    }

    // Abstract method
    void sayGoodbye();
}

// Implement the interface
class MyClass1 implements MyInterface1 {
    // Override the abstract method
    public void sayGoodbye() {
        System.out.println("Goodbye from MyClass1");
    }
}

// Main class to demonstrate the usage
public class Defaultmethod2 {
    public static void main(String[] args) {
        MyClass1 obj = new MyClass1();
        obj.sayHello(); // Output: Hello from MyInterface1
        obj.sayGoodbye(); // Output: Goodbye from MyClass1
    }
}
