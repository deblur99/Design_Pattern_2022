package Strategy.practice1;

public class QuackRegular implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
