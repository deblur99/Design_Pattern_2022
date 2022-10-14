package Decorator.MyPractice;

public abstract class Condiment extends Coffee {
    // 고민해 보기: Component 객체의 Size값을 변화시키지 않고, 정확하게 Decorator 객체의 Size값을 변화시킬 수 있는 방법!
    Coffee coffee;

    public Condiment() {}

    public Condiment(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public abstract int cost();
}
