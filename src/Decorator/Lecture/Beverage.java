package Decorator.Lecture;

public abstract class Beverage {
    protected String description = "Untitled";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
