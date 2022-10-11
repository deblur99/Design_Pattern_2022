package Decorator.MyPractice;

// Concrete Component
public class Grape extends Fruit {
    public Grape(int price) {
        super(price);
    }


    @Override
    public int cost() {
        return 2000;
    }
}
