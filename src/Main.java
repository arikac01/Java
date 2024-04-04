//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import Beverage.Coffee;
import Beverage.CoffeePowder;
import Beverage.ColdCoffee;
import Beverage.IceTea;
import mypack.Rabbit;
import mypack.Hawk;
import mypack.Fish;
import mypack1.EggDosa;
import mypack1.MasalaDosa;
import mypack1.PlainDosa;
import mypack1.Uthappam;

public class Main {
    //mypack interface main method
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.flee();
        Hawk hawk = new Hawk();
        hawk.Hunt();
        Fish fish = new Fish();
        fish.flee();
        fish.Hunt();
    }
}
    //mypack1 interface main method

//    public static void main(String[] args){
//        PlainDosa plainDosa = new PlainDosa();
//        plainDosa.PlainDosaIngredients();
//        MasalaDosa masalaDosa = new MasalaDosa();
//        masalaDosa.MasalaDosaIngredients();
//        EggDosa eggDosa = new EggDosa();
//        eggDosa.EggDosaIngredients();
//        Uthappam uthappam = new Uthappam();
//        uthappam.UthappamIngredients();
//    }

//    public static void main(String[] args){
//        Coffee coffee = new Coffee();
//        coffee.StartCoffee();
//        ColdCoffee coldCoffee =new ColdCoffee();
//        coldCoffee.StartColdCoffee();
//        IceTea iceTea =new IceTea();
//        iceTea.StartIceTea();
//    }
//}

/* We can achieve concept of Data Abstraction in two ways.
* Abstract Class and Interfaces.
* With Abstract class, we can achieve 0 to 100% abstraction,
* But with Interface, we can achieve 100% abstraction.
* Because Abstract class can have both abstract and non-abstract methods,
* whereas Interfaces have only abstract methods.
* Both Abstract classes and Interfaces can't be instantiated.
* With Interface, we can also achieve Multiple inheritance.
* Classes can extend a single parent class, whereas a class can implement(key word for interface)
* multiple interfaces.
* The feilds in Interface are Final and Static by default. */