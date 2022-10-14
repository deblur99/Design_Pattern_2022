package Decorator.Lecture;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        setDescription("DarkRoast Coffee");
    }

    @Override
    public double getSizeCost() {
        System.out.print(getSize()+", "); // debug
        switch (getSize()) {
            case TALL:
                return 3.59;
            case GRANDE:
                return 4.09;
            case VENTI:
                return 4.59;
            default:
                return .0;
        }
    }
}
