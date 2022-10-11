package Decorator.Study.Old;

public class Espresso extends Beverage {
    private final int cost = 2000;

    public Espresso(String description) {
        super(description);
    }

    @Override
    public int cost() {
        return super.cost() + cost;
    }
}
