package mypack1;

public class MasalaDosa implements Dosa {
    public void MasalaDosaIngredients(){
        DosaBatter();
        Onions();
        Mirchi();
        Chutney();
        Masala();
        Egg();
    }
    @Override
    public void DosaBatter() {
        System.out.println("Yes, Dosa Batter needed");
    }

    @Override
    public void Onions() {
        System.out.println("No Onions needed");
    }

    @Override
    public void Mirchi() {
        System.out.println(" No Mirchi also");
    }

    @Override
    public void Chutney() {
        System.out.println("Chutney is a must");
    }

    @Override
    public void Masala() {
        System.out.println("Ofcourse Masala");
    }

    @Override
    public void Egg() {
        System.out.println("No Eggs");
    }
}
