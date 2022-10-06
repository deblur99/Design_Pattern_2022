package Strategy.practice1;

import java.util.ArrayList;

// Strategy : 코드 확장성 및 재사용성 측면에서 좋다. (SRP, OCP, ISP 부합)
public class DuckTest {
    public static void main(String[] args) {
        ArrayList<Duck> duckList = new ArrayList<Duck>();
        duckList.add(new MallardDuck());
        duckList.add(new RedHeadDuck());
        duckList.add(new DecoyDuck());
        duckList.add(new MechDuck());
        duckList.add(new GreenDuck());

        for (Duck duck: duckList) {
            if (duck instanceof RedHeadDuck) {
                duck.setFlyBehavior(new FlyNoWay());
                duck.setQuackBehavior(new QuackBackward());
            }

            duck.display();
            duck.fly();
            duck.quack();
            duck.swim();
        }
    }
}
