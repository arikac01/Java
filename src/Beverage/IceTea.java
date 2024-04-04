package Beverage;

public class IceTea implements Ice, Sugar, TeaPowder, Milk{
    public void StartIceTea(){
        System.out.println("Lets start making Ice Tea");
        ice();
        teaPowder();
        milk();
        water();
        sugar();
        noSugar();
        System.out.println("Stir it up all together and Ice Tea is ready");
    }
    @Override
    public void ice() {
        System.out.println("Add Ice upto your level of choice");
    }

    @Override
    public void milk() {
        System.out.println("Add 100ml of milk");
    }

    @Override
    public void water() {
        System.out.println("Add 100ml water");
    }

    @Override
    public void sugar() {
        System.out.println("Add 2 spoons of sugar if you want it to be sweet");
    }

    @Override
    public void noSugar() {
        System.out.println("Add zero sugar if you want it to be sugar free");
    }

    @Override
    public void teaPowder() {
        System.out.println("Add filtered plain tea");
    }
}
