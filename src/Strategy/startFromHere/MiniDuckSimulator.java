package Strategy.startFromHere;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck rubberDuckie = new RubberDuck();
        Duck decoy = new DecoyDuck();
        Duck model = new ModelDuck();

        mallard.display();
        mallard.fly();
        mallard.quack();
        mallard.swim();

        rubberDuckie.display();
        rubberDuckie.fly();
        rubberDuckie.quack();
        rubberDuckie.swim();

        decoy.display();
        decoy.fly();
        decoy.quack();
        decoy.swim();

        model.display();
        model.fly();
        model.quack();
        model.swim();
    }
}
