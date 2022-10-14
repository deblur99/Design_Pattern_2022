package Decorator.Quiz.startFromHere;

public class Shot extends OptionDecorator {
    public Shot() {}

    public Shot(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Shot";
    }

    @Override
    public double cost() {
        return beverage.cost() + .50;
    }
}
