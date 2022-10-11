package Decorator.Study;

public class Soy extends CondimentDecorator {
    // 데코레이터의 생성자는 컴포넌트 객체에 대한 Aggregation!
    // 생성자의 매개변수로 컴포넌트 객체를 받아, 데코레이터 클래스의 멤버 변수인 컴포넌트 객체에 할당한다.
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy Milk";
    }

    @Override
    public double getSizeCost() {
        double cost = 0.0;

        switch (getSize()) {
            case TALL:
                break;
            case GRANDE:
                cost += 0.2;
                break;
            case VENTI:
                cost += 0.4;
        }
        return cost;
    }

    public double cost() {
        return beverage.cost() + getSizeCost() + .15;
    }
}
