package Strategy.practice1;

public class GreenDuck extends Duck {
    public GreenDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new QuackArtificial();
    }

    @Override
    public void display() {
        System.out.println("I am a green duck");
    }
}
