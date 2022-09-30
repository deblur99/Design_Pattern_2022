package Observer.OnClass;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        DisplayObserver currentConditionDisplay = new CurrentConditionsDisplay(weatherData);
        DisplayObserver statisticsDisplay = new StatisticsDisplay(weatherData);
        DisplayObserver forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.attach(forecastDisplay);
        weatherData.attach(statisticsDisplay);
        weatherData.attach(currentConditionDisplay);

        weatherData.setMeasurements(10.5f, 60.2f, 100.4f);
        weatherData.setMeasurements(18.5f, 30.8f, 90.5f);
        weatherData.setMeasurements(15.2f, 35.6f, 100.5f);
    }
}
