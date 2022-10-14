package Decorator.Quiz.startFromHere;

public abstract class OptionDecorator extends Beverage {
    Beverage beverage;

    public OptionDecorator() {}

    public OptionDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
