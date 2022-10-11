package Decorator.Study;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        setDescription("DarkRoast");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
