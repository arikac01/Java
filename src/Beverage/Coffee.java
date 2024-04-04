package Beverage;

public class Coffee implements Milk,CoffeePowder, Sugar{
public void StartCoffee(){
    System.out.println("Lets start making coffee");
    coffeePowder();
    milk();
    water();
    sugar();
    noSugar();
    System.out.println("Heat it up all together and Coffee is ready");
}
    @Override
    public void coffeePowder() {
        System.out.println("Add 1 and half spoon of Coffee Powder");
    }

    @Override
    public void milk() {
        System.out.println("Add 200ml of milk");
    }

    @Override
    public void water() {
        System.out.println("Add water to your consistency choice");
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
