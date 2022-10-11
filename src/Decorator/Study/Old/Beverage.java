package Decorator.Study.Old;

// Component 클래스
public class Beverage {
    protected String description;
    protected Boolean milk;
    protected Boolean soy;
    protected Boolean mocha;
    protected Boolean whip;

    public Beverage(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int cost() {
        return 4000;
    }

    public Boolean hasMilk() {
        return milk;
    }

    public void setMilk(Boolean milk) {
        this.milk = milk;
    }

    public Boolean hasSoy() {
        return soy;
    }

    public void setSoy(Boolean soy) {
        this.soy = soy;
    }

    public Boolean hasMocha() {
        return mocha;
    }

    public void setMocha(Boolean mocha) {
        this.mocha = mocha;
    }

    public Boolean hasWhip() {
        return whip;
    }

    public void setWhip(Boolean whip) {
        this.whip = whip;
    }
}
