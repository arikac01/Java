package DefaultStaticMethodReferences;

// Define a utility class with static methods
class MyUtility {
    static int add(int a, int b) {
        return a + b;
    }
}

// Main class
public class Staticmethod2 {
    public static void main(String[] args) {
        int sum = MyUtility.add(5, 3);
        System.out.println("Sum: " + sum);
    }
}
