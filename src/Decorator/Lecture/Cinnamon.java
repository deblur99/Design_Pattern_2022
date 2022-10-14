package Decorator.Lecture;

public class Cinnamon extends Condiment {
    public Cinnamon(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Cinnamon";
    }

    @Override
    public double getSizeCost() {
        switch (getSize()) {
            case TALL:
                return .2;
            case GRANDE:
                return .4;
            case VENTI:
                return .6;
            default:
                return .0;
        }
    }

    @Override
    public double cost() {
        // 감싸고 있는 객체에서의 cost, size cost + 현재 객체에서의 size cost
        // 참고: 데코레이터는 감싸기만, 컴포넌트는 감싸지기만 한다.
        // 즉, 컴포넌트는 일정한 값만을 반환해야지 재귀호출을 해선 안 된다.
        return beverage.cost() + getSizeCost();
    }
}
