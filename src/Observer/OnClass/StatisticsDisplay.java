package Observer.OnClass;

public class StatisticsDisplay implements DisplayObserver {
    private float tempSum = 0.f;
    private float maxTemp = 0.f;
    private float minTemp = 0.f;
    private int numReadings = 0;
    private WeatherData weatherData = null;

    private void getDataObject(WeatherData data) {
        this.weatherData = data;
    }

    public StatisticsDisplay(WeatherData data) {
        this.weatherData = data;
    }

    @Override
    public void update() {
        display(weatherData.getTemperature(), weatherData.getHumidity()); // 변경할 부분들을 따로 뺴놓아 그 부분을 하나의 함수로 묶어 호출한다 -> 캡슐화
    }

    private void display(float temp, float humidity) {
        tempSum += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        else if (temp < maxTemp) {
            minTemp = temp;
        }

        System.out.println(String.format("Avg/Max/Min temperature = %f / %f / %f.", tempSum / numReadings, maxTemp, minTemp));
    }
}
