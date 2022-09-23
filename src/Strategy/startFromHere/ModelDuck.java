package Strategy.startFromHere;

public class ModelDuck extends Duck {
	public ModelDuck() {
		setFlyBehavior(new FlyRocketPowered());
		setQuackBehavior(new FakeQuack());
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
