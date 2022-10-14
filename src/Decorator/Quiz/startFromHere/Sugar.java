package Decorator.Quiz.startFromHere;

public class Sugar extends OptionDecorator {
    public Sugar() {}

    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Sugar";
    }

    @Override
    public double cost() {
        return beverage.cost() + .33;
    }
}
