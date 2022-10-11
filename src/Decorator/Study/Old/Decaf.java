package Decorator.Study.Old;

public class Decaf extends Beverage {
    private final int cost = 1500;

    public Decaf(String description) {
        super(description);
    }

    @Override
    public int cost() {
        return super.cost() + cost;
    }
}
