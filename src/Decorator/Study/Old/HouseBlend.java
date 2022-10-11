package Decorator.Study.Old;

public class HouseBlend extends Beverage {
    private final int cost = 500;

    public HouseBlend(String description) {
        super(description);
    }

    @Override
    public int cost() {
        return super.cost() + cost;
    }
}
