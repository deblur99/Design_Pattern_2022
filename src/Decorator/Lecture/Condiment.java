package Decorator.Lecture;

public abstract class Condiment extends Beverage {
    // Remark: Aggregation은 Decorator부터!
    Beverage beverage;

    // Default 생성자 관련 문제로 인해 비어있는 생성자를 반드시 선언 및 정의해야 한다.
    public Condiment() {}

    public Condiment(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public abstract double cost();

    @Override
    public abstract double getSizeCost();
}
