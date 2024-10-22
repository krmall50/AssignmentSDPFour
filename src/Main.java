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

        TV tv  = new TV();
        Stereo stereo = new Stereo();
        Light light = new Light();
        Command tvOn = new TurnTVOn(tv);
        Command setVolumeStereo = new SetVolume(stereo, 10);
        Command dimLight = new DimLights(light);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(1, tvOn);
        remoteControl.setCommand(2, setVolumeStereo);
        remoteControl.setCommand(3, dimLight);
        System.out.println("Pressing TV on button:");
        remoteControl.pressButton(1);
        System.out.println("Pressing set volume button:");
        remoteControl.pressButton(2);
        System.out.println("Pressing dim lights button:");
        remoteControl.pressButton(3);
        System.out.println("Pressing undo:");
        remoteControl.pressUndo();

        System.out.println("----------------State---------------");

        Order order = new Order();
        System.out.println("Order process is started");
        order.payOrder();
        order.shipOrder();
        order.deliverOrder();
        order.cancelOrder();
        System.out.println("order 2:");
        Order order2 = new Order();
        order2.payOrder();
        order2.cancelOrder();
        order2.deliverOrder();

        System.out.println("----------------Chain-of-Responsibility---------------");

        ApprovalChain approvalChain = new ApprovalChain();
        ExpenseRequest request1 = new ExpenseRequest(200, "Order pizza");
        ExpenseRequest request2 = new ExpenseRequest(4000, "Hang out");
        ExpenseRequest request3 = new ExpenseRequest(8000, "New setup");
        ExpenseRequest request4 = new ExpenseRequest(16000, "Servers");
        System.out.println("Processing requests");
        approvalChain.processRequest(request1);
        approvalChain.processRequest(request2);
        approvalChain.processRequest(request3);
        approvalChain.processRequest(request4);
    }
}