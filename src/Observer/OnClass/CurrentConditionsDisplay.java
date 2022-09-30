package Observer.OnClass;

public class CurrentConditionsDisplay implements DisplayObserver {
    private WeatherData weatherData = null;

    public CurrentConditionsDisplay(WeatherData data) {
        this.weatherData = data;
    }

    @Override
    public void update() {
        // Subject 객체를 여기에서 가져옴으로써, Subject 객체 내부의 상태 변화값을 이 객체 내부에 쓴다.
        display(weatherData.getTemperature(), weatherData.getHumidity());
    }

    private void display(float temperature, float humidity) {
        System.out.println(String.format("Current conditions: %f temperature and %f%% humidity.", temperature, humidity));
    }
}
