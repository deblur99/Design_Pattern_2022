package Decorator.Study.Old;

public class DarkRoast extends Beverage {
    private final int cost = 1000;

    public DarkRoast(String description) {
        super(description);
    }

    @Override
    public int cost() {
        return super.cost() + cost;
    }
}
