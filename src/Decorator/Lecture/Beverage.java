package Decorator.Lecture;

public abstract class Beverage {
    private Size size = Size.TALL;
    private String description = "Untitled";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) { this.description = description; }

    public Size getSize() { return size; }

    public void setSize(Size size) { this.size = size; }

    // 변경점: 추상 메서드였던 cost() 메서드를 최상위 클래스인 Beverage에서 구현하고,
    // getSizeCost() 메서드는 각 구현 클래스 내에서 내용이 모두 다르기 때문에 추상 메서드로 유지했다.
    public abstract double getSizeCost();

    public double cost() {
        return getSizeCost();
    }
}
