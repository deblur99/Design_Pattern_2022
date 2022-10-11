package Decorator.MyPractice;

// Component
public abstract class Fruit {
    private int price;
    private int soldQuantity;

    public Fruit(int price) {
        this.price = price;
    }

    protected void addPrice(int price) {
        this.price += price;
    }

    public abstract int cost();
}
