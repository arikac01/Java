package Beverage;

public class ColdCoffee implements Ice, CoffeePowder, Milk, Sugar{
    public void StartColdCoffee(){
        System.out.println("Lets start making Cold coffee");
        ice();
        coffeePowder();
        milk();
        water();
        sugar();
        noSugar();
        System.out.println("Stir it up all together and Coffee is ready");
    }
    @Override
    public void ice() {
        System.out.println("Add Ice upto your level of choice");
    }

    @Override
    public void coffeePowder() {
        System.out.println("Add 1 and half spoon of Coffee Powder");
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
}
