package Strategy.practice1;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new QuackRegular();
    }

    @Override
    public void display() {
        System.out.println("I am a red head duck");
    }
}
