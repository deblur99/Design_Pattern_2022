package Strategy.practice1;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new QuackBackward();
    }

    @Override
    public void display() {
        System.out.println("I am a decoy duck");
    }
}
