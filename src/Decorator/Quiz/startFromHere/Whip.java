package Decorator.Quiz.startFromHere;

public class Whip extends OptionDecorator {
    public Whip() {}

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
