package Decorator.Lecture;

public class Mocha extends Condiment {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double getSizeCost() {
        switch (getSize()) {
            case TALL:
                return .33;
            case GRANDE:
                return .66;
            case VENTI:
                return .99;
            default:
                return .0;
        }
    }

    @Override
    public double cost() {
        return beverage.cost() + getSizeCost();
    }
}
