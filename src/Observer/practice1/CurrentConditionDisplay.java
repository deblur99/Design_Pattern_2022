package Observer.practice1;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temp;
    private float humid;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(String.format("현재 상태: 온도 %.2fC, 습도 %.2f%%", temp, humid));
    }

    @Override
    public void update(float temp, float humid, float press) {
        this.temp = temp; this.humid = humid;
        display();
    }
}
