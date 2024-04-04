package mypack1;

public class EggDosa implements Dosa{
    public void EggDosaIngredients(){
        DosaBatter();
        Onions();
        Mirchi();
        Chutney();
        Masala();
        Egg();
    }
    @Override
    public void DosaBatter() {
        System.out.println("Yes, Dosa Batter is needed");
    }

    @Override
    public void Onions() {
        System.out.println("No Onions needed");
    }

    @Override
    public void Mirchi() {
        System.out.println("No Mirchi needed");
    }

    @Override
    public void Chutney() {
        System.out.println("Chutney is a must");
    }

    @Override
    public void Masala() {
        System.out.println("No Masala");
    }

    @Override
    public void Egg() {
        System.out.println("Of course Eggs are must");
    }
}
