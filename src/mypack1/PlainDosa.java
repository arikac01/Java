package mypack1;

public class PlainDosa implements Dosa{
    public void PlainDosaIngredients(){
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
        System.out.println("Yes, Chutney is a must");
    }

    @Override
    public void Masala() {
        System.out.println("i said Plain, not masala. so no masala");
    }

    @Override
    public void Egg() {
        System.out.println("No eggs");
    }
}
