package Decorator.Lecture;

public class Decaffeine extends Beverage {
    public Decaffeine() {
        description = "Decaffeine coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
