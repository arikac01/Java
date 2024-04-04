package mypack1;

public class Uthappam implements Dosa{
    public void UthappamIngredients(){
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
        System.out.println("Onions needed");
    }

    @Override
    public void Mirchi() {
        System.out.println("Mirchi needed");
    }

    @Override
    public void Chutney() {
        System.out.println("Yes, Chutney is a must");
    }

    @Override
    public void Masala() {
        System.out.println("No Masala");
    }

    @Override
    public void Egg() {
        System.out.println("No Eggs");
    }
}
