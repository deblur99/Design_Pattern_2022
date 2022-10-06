package Observer.practice1;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(28.f, 80.f, 32.4f);
        weatherData.setMeasurements(28.f, 80.f, 32.4f);
        weatherData.setMeasurements(28.f, 80.f, 32.4f);
    }
}
