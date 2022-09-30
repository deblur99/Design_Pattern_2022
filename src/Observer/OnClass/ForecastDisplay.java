package Observer.OnClass;

public class ForecastDisplay implements DisplayObserver {
    private float lastPressure = 0.f;
    private WeatherData weatherData = null;

    public ForecastDisplay(WeatherData data) {
        this.weatherData = data;
    }

    @Override
    public void update() {
        display(weatherData.getPressure());
    }

    private void display(float pressure) {
        float currentPressure = pressure;

        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler or rainy weather.");
        } else {
            System.out.println("More of the same.");
        }
    }
}
