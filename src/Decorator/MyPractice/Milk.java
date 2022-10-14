package Decorator.MyPractice;

public class Milk extends Condiment {
    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDesc() {
        return coffee.getDesc() + ", Milk";
    }

    @Override
    public int cost() {
        int cost = coffee.cost();

        switch (coffee.getSize()) {
            case SMALL -> cost += 500;
            case MEDIUM -> cost += 1000;
            case LARGE -> cost += 1500;
        }

        return cost;
    }
}
