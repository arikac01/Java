package mypack;

public class Fish implements Prey, Predator{

    @Override
    public void Hunt() {
        System.out.println("Big Fish Hunts");
    }

    @Override
    public void flee() {
        System.out.println("Small Fish Flees");
    }
}
