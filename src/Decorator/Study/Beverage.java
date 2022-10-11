package Decorator.Study;

// Component 클래스
public abstract class Beverage {
    private String description = "Untitled";
    private Size size = Size.TALL;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public abstract double cost();
}
