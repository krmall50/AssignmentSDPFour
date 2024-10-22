public class WeatherData {
    private WeatherStation weatherStation;
    public WeatherData(){
        weatherStation = new WeatherStation();
    }
    public void addDisplay(WeatherDisplay display){
        weatherStation.addObserver(display);
    }
    public void removeDisplay(WeatherDisplay display){
        weatherStation.removeObserver(display);
    }
    public void changeWeatherData(float temperature, float humidity, float pressure) {
        weatherStation.setWeatherData(temperature, humidity, pressure);
    }
}
