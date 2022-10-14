package Decorator.Lecture;

public class Espresso extends Beverage {
    public Espresso() {
        setDescription("Espresso Coffee");
    }

    @Override
    public double getSizeCost() {
        switch (getSize()) {
            case TALL:
                return 2.99;
            case GRANDE:
                return 3.29;
            case VENTI:
                return 3.59;
            default:
                return .0;
        }
    }

    @Override
    public double cost() {
        return getSizeCost();
    }
}