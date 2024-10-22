public class ForecastDisplay implements WeatherDisplay{
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Forecast: " + temperature + " degree, " + humidity + " humidity, " + pressure + " pressure");
    }
}
