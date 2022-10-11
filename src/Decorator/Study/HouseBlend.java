package Decorator.Study;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        setDescription("House Blended Coffee");
    }

    @Override
    public double cost() {
        return .89;
    }
}
