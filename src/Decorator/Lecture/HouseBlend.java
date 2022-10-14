package Decorator.Lecture;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
