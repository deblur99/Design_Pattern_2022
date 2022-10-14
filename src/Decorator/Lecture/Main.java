package Decorator.Lecture;

import java.util.ArrayList;

public class Main {
    private static void beverageTest(Beverage beverage) {
        System.out.println("====== Applying Decorator to be "+beverage.getDescription()+" ======");
        beverage = new Milk(beverage);
        beverage = new Sugar(beverage);
        beverage = new Sugar(beverage);
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Cinnamon(beverage);

        beverage.setSize(Size.TALL);
        System.out.println(beverage.getSize()+" "+beverage.getDescription() + ", $" + beverage.cost());

        beverage.setSize(Size.GRANDE);
        System.out.println(beverage.getSize()+" "+beverage.getDescription() + ", $" + beverage.cost());

        beverage.setSize(Size.VENTI);
        System.out.println(beverage.getSize()+" "+beverage.getDescription() + ", $" + beverage.cost());

        beverage.setSize(Size.TALL);
        System.out.println(beverage.getSize()+" "+beverage.getDescription() + ", $" + beverage.cost());
    }

    public static void main(String[] args) {
        ArrayList<Beverage> beverageArrayList = new ArrayList<Beverage>();

        Beverage myBeverage = new DarkRoast();
        System.out.println(myBeverage.getDescription() + ", $" + myBeverage.cost());
        beverageArrayList.add(myBeverage);

        Beverage yourBeverage = new Decaffeine();
        System.out.println(yourBeverage.getDescription() + ", $" + yourBeverage.cost());
        beverageArrayList.add(yourBeverage);

        Beverage hisBeverage = new Espresso();
        System.out.println(hisBeverage.getDescription() + ", $" + hisBeverage.cost());
        beverageArrayList.add(hisBeverage);

        Beverage herBeverage = new HouseBlend();
        System.out.println(herBeverage.getDescription() + ", $" + herBeverage.cost());
        beverageArrayList.add(herBeverage);

        for (Beverage beverage: beverageArrayList) {
            beverageTest(beverage);
        }
    }
}
