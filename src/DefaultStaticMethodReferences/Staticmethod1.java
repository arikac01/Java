package DefaultStaticMethodReferences;

// Define an interface with a static method
interface MyStaticInterface {
    static void printMessage() {
        System.out.println("Hello from static method in MyInterface");
    }
}

// Main class to demonstrate the usage
public class Staticmethod1 {
    public static void main(String[] args) {
        MyStaticInterface.printMessage();
    }
}
