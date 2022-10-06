package Strategy.practice1;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new QuackRegular();
    }

    @Override
    public void display() {
        System.out.println("I am a mallard duck");
    }
}
