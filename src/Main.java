//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("----------------Strategy---------------");

        PaymentStrategy creditCard = new CreditCardPayment();
        PaymentStrategy paypal = new PayPalPayment();
        PaymentStrategy crypto = new CryptoPayment();
        ShoppingCart cart = new ShoppingCart(creditCard);
        cart.checkout(150000);
        cart.setPaymentStrategy(paypal);
        cart.checkout(20000);
        cart.setPaymentStrategy(crypto);
        cart.checkout(128);

        System.out.println("----------------Observer---------------");

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        weatherData.addDisplay(currentConditionsDisplay);
        weatherData.addDisplay(statisticsDisplay);
        weatherData.addDisplay(forecastDisplay);
        System.out.println("First update:");
        weatherData.changeWeatherData(25.0f, 65.0f, 1012.0f);
        System.out.println();
        System.out.println("Second update:");
        weatherData.changeWeatherData(27.5f, 70.0f, 1008.5f);
        weatherData.removeDisplay(statisticsDisplay);
        System.out.println();
        System.out.println("Third update (without statistics display):");
        weatherData.changeWeatherData(30.0f, 60.0f, 1005.0f);

        System.out.println("----------------Command---------------");



    }
}