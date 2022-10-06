package Strategy.practice1;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly with rocket power");
    }
}