package Decorator.Lecture;

public class Milk extends Condiment {
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double getSizeCost() {
        switch (getSize()) {
            case TALL:
                return .15;
            case GRANDE:
                return .3;
            case VENTI:
                return .45;
            default:
                return .0;
        }
    }

    @Override
    public double cost() {
        return beverage.cost() + getSizeCost();
    }
}
