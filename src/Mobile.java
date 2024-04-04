interface Sim{
    void calling();
}
interface Datapack{
    void usingInternet();
}
class Idea implements Datapack, Sim{
    @Override
    public void calling() {
        System.out.println("Calling by Idea sim");
    }

    @Override
    public void usingInternet() {
        System.out.println("Using Idea Internet Data pack");
    }
}
class Jio implements Sim{
    @Override
    public void calling() {
        System.out.println("Calling by Jio sim");
    }
}
class Airtel implements Sim{

    @Override
    public void calling() {
        System.out.println("calling by airtel sim");
    }
}

public class Mobile {
    public static void main(String[] k){
        Sim sim= new Jio();
        Sim sim1= new Airtel();
        Idea idea = new Idea();
        idea.calling();
        idea.usingInternet();
        sim.calling();

    }
}
/*Exception handling -5
* few more on interfaces.*/
