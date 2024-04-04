interface Sodas{
    void sodaName();
}
interface SodaMix{
    void mixName();
}
interface Drink extends Sodas, SodaMix{
    void drinkName();
}
class Coke implements Sodas{

    @Override
    public void sodaName() {
        System.out.println("Soda - Coke");
    }
}
class Sprite implements SodaMix{

    @Override
    public void mixName() {
        System.out.println("mix - sharbath");
    }
}
class ClubSoda implements Drink{

    @Override
    public void sodaName() {
        System.out.println("Soda- Club Soda");
    }

    @Override
    public void mixName() {
        System.out.println("Mix - Lemon juice");
    }

    @Override
    public void drinkName() {
        System.out.println("Nannari Sharbath");
    }
}
public class Soda {
    public static void main(String[] args){
        SodaMix sprite = new Sprite();
        Sodas coke = new Coke();
        Drink clubSoda = new ClubSoda();
        sprite.mixName();
        coke.sodaName();
        clubSoda.sodaName();
        clubSoda.drinkName();
        clubSoda.mixName();
    }
}
