package Decorator.Lecture;

public class Main {
    public static void main(String[] args) {
        Beverage myBeverage = new DarkRoast();
        System.out.println(myBeverage.getDescription()+", $"+myBeverage.cost());
        Beverage yourBeverage = new Decaffeine();
        System.out.println(yourBeverage.getDescription()+", $"+yourBeverage.cost());
        Beverage hisBeverage = new Espresso();
        System.out.println(hisBeverage.getDescription()+", $"+hisBeverage.cost());
        Beverage herBeverage = new HouseBlend();
        System.out.println(herBeverage.getDescription()+", $"+herBeverage.cost());

        System.out.println("====== Applying Decorator to Component ======");
        myBeverage = new Milk(myBeverage);
        System.out.println(myBeverage.getDescription()+", $"+myBeverage.cost());
    }
}
