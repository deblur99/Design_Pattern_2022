package Decorator.Lecture;

public class Decaffeine extends Beverage {
    public Decaffeine() {
        setDescription("Decaffeine coffee");
    }

    @Override
    public double getSizeCost() {
        switch (getSize()) {
            case TALL:
                return 3.89;
            case GRANDE:
                return 4.39;
            case VENTI:
                return 4.89;
            default:
                return .0;
        }
    }

    @Override
    public double cost() {
        return getSizeCost();
    }
}
