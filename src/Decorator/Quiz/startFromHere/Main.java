package Decorator.Quiz.startFromHere;

public class Main {

    public static void main(String[] args) {
        System.out.println("======= Before Applying Decorator =======");
        Beverage myBeverage = new HouseBlend();
        System.out.println(myBeverage.getDescription() + " $" + myBeverage.cost());
        Beverage yourBeverage = new DarkRoast();
        System.out.println(yourBeverage.getDescription() + " $" + yourBeverage.cost());
        Beverage hisBeverage = new Decaf();
        System.out.println(hisBeverage.getDescription() + " $" + hisBeverage.cost());
        Beverage herBeverage = new Espresso();
        System.out.println(herBeverage.getDescription() + " $" + herBeverage.cost());

        System.out.println();

        System.out.println("======= After Applying Decorator =======");
        myBeverage = new Sugar(myBeverage);
        myBeverage = new Whip(myBeverage);
        myBeverage = new AlmondMilk(myBeverage);
        myBeverage = new Shot(myBeverage);
        System.out.println(myBeverage.getDescription()+" $"+myBeverage.cost());

        yourBeverage = new Shot(yourBeverage);
        yourBeverage = new Shot(yourBeverage);
        yourBeverage = new Shot(yourBeverage);
        yourBeverage = new Shot(yourBeverage);
        System.out.println(yourBeverage.getDescription()+" $"+yourBeverage.cost());
//        myBeverage = new Shot(new Shot(new Sugar(new Beverage())));
    }
}
