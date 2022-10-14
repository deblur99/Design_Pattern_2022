package Decorator.Quiz.startFromHere;

public class AlmondMilk extends OptionDecorator {
    public AlmondMilk() {}

    public AlmondMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Almond";
    }

    @Override
    public double cost() {
        return beverage.cost() + .66;
    }
}
