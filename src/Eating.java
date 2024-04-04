interface EatingWhat{
    void whatAreYouEating();
}
class Breakfast implements EatingWhat{

    @Override
    public void whatAreYouEating() {
        System.out.println("I am Eating Breakfast");
    }
}
class Lunch implements EatingWhat{

    @Override
    public void whatAreYouEating() {
        System.out.println("I am having my Lunch");
    }
}
class Dinner implements EatingWhat{

    @Override
    public void whatAreYouEating() {
        System.out.println("I am Eating my Dinner");
    }
}
public class Eating {
    public static void main(String[] args){
        EatingWhat breakfast = new Breakfast();
        EatingWhat lunch = new Lunch();
        EatingWhat dinner = new Dinner();
        breakfast.whatAreYouEating();
        lunch.whatAreYouEating();
        dinner.whatAreYouEating();
    }
}
