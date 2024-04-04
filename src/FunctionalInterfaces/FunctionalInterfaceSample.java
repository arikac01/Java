package FunctionalInterfaces;


interface sayable{
    void say(String msg);
}
public class FunctionalInterfaceSample implements sayable{
    @Override
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaceSample fis = new FunctionalInterfaceSample();
        fis.say("Hi there!");
    }
}
