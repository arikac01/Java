package DefaultStaticMethodReferences;

interface Sayable{
    void say();
}
public class ReferenceInstance {
    public void saySomething(){
        System.out.println("Hello, this is non-static method.");
    }
    public static void main(String[] args) {
        ReferenceInstance methodReference = new ReferenceInstance(); // Creating object
        // Referring non-static method using reference
        Sayable sayable = methodReference::saySomething;
        // Calling interface method
        sayable.say();
    }
}
