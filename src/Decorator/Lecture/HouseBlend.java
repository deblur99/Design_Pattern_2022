package Decorator.Lecture;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        setDescription("HouseBlend Coffee");
    }

    @Override
    public double getSizeCost() {
        switch (getSize()) {
            case TALL:
                return 3.69;
            case GRANDE:
                return 3.99;
            case VENTI:
                return 4.29;
            default:
                return .0;
        }
    }

    @Override
    public double cost() {
        return getSizeCost();
    }
}
