package Decorator.MyPractice;

public abstract class Coffee {
    private Size size;
    private String desc = "Untitled";

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract int cost();
}
