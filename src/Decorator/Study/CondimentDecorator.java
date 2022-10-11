package Decorator.Study;

// 데코레이터 패턴의 시작은 컴포넌트 추상 클래스를 상속받는 데코레이터 추상 클래스를 만드는 것!
// 데코레이터 클래스 내부에는 컴포넌트 추상 클래스의 객체를 멤버 변수에 포함해야 한다.
public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public CondimentDecorator() {}

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    // 부모 클래스에서 이미 구현한 메서드를 다시 자식 클래스에서 추상 메서드로 선언할 수 있다.
    public abstract String getDescription();

    public abstract double getSizeCost();

    @Override
    public double cost() {
        return 0;
    }
}
