package Decorator.Lecture;

public class Sugar extends Condiment {
    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Sugar";
    }

    @Override
    public double getSizeCost() {
        switch (getSize()) {
            case TALL:
                return .2;
            case GRANDE:
                return .3;
            case VENTI:
                return .4;
            default:
                return .0;
        }
    }

    @Override
    public double cost() {
        return beverage.cost() + getSizeCost();
    }
}
