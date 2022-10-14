package Decorator.MyPractice;

public class Espresso extends Coffee {
    public Espresso() {
        setDesc("Espresso");
    }

    @Override
    public int cost() {
        return 4000;
    }
}
