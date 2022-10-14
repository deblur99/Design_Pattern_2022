package Decorator.Lecture;

public abstract class Condiment extends Beverage {
    // Remark: Aggregation은 Decorator부터!
    Beverage beverage;

    public Condiment() {

    }

    public Condiment(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public abstract double cost();
}
