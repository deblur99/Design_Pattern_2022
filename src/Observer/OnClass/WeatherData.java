package Observer.OnClass;

import java.util.ArrayList;

public class WeatherData extends DataObject {
    private float temperature;
    private float humidity;
    private float pressure;

//    ArrayList<DisplayObserver> observers = new ArrayList<DisplayObserver>();

//    public void attach(DisplayObserver displayObserver) {
//        observers.add(displayObserver);
//    }
//
//    public void detach(DisplayObserver displayObserver) {
//        observers.remove(displayObserver);
//    }

    public void measurementsChanged() {
        float temperature = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        myNotify();

//        for (DisplayObserver observer : observers) {
//            observer.update(temperature, humidity, pressure);
//        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        measurementsChanged();
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humiditye) {
        this.humidity = humidity;
        measurementsChanged();
    }
}
