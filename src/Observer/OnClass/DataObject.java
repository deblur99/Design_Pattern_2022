package Observer.OnClass;

import java.util.ArrayList;

public abstract class DataObject {
    private ArrayList<DisplayObserver> observers = new ArrayList<DisplayObserver>();

    public void attach(DisplayObserver observer) {
        observers.add(observer);
    }

    public void detach(DisplayObserver observer) {
        observers.remove(observer);
    }

    public void myNotify() {
        for (DisplayObserver observer: observers) {
            // 일반화를 위해 update() 메서드의 parameter를 없앤다.
            observer.update();
        }
    }

    public void update(DisplayObserver observer) {
        observers.add(observer);
    }
}
