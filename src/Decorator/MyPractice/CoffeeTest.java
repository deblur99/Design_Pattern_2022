package Decorator.MyPractice;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee myCoffee = new Espresso();
        myCoffee = new Milk(myCoffee);

        myCoffee.setSize(Size.SMALL);
        System.out.println(myCoffee.getDesc()+" "+myCoffee.cost());

        myCoffee.setSize(Size.MEDIUM);
        System.out.println(myCoffee.getDesc()+" "+myCoffee.cost());

        myCoffee.setSize(Size.LARGE);
        System.out.println(myCoffee.getDesc()+" "+myCoffee.cost());
    }
}
