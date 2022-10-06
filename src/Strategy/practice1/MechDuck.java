package Strategy.practice1;

public class MechDuck extends Duck {
    public MechDuck() {
        flyBehavior = new FlyRocketPowered();
        quackBehavior = new QuackArtificial();
    }

    @Override
    public void display() {
        System.out.println("I am a mecha duck");
    }
}
