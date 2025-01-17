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

        System.out.println("----------------Mediator---------------");

        ChatMediator room = new ChatRoom();

        User user1 = new RegularUser(room, "user1");
        User user2 = new PremiumUser(room, "USER2");
        User user3 = new RegularUser(room, "user3");

        user1.send("Some message");
        user2.send("Some premium message");

        System.out.println("----------------Memento---------------");

        Document doc = new Document();
        VersionControl VC = new VersionControl();

        doc.setContent("Some content");
        VC.saveVersion(doc.save());
        doc.setContent("Some content 3");
        VC.saveVersion(doc.save());
        doc.setContent("Some content 6");
        VC.saveVersion(doc.save());
        doc.setContent("Some content 12");
        VC.saveVersion(doc.save());
        VC.listVersions();
        System.out.println("Restoring version 2: ");
        doc.restore(VC.getVersion(1));
        System.out.println("Current: " + doc.getContent());

        System.out.println("----------------Visitor---------------");

        Shape circle = new Circle(2);
        Shape rect = new Rectangle(4, 8);
        Shape triangle = new Triangle(8, 16);
        Drawing drawing = new Drawing();
        drawing.addShape(circle);
        drawing.addShape(rect);
        drawing.addShape(triangle);
        AreaCalculator areaCalculator = new AreaCalculator();
        drawing.calculateAreas(areaCalculator);

        System.out.println("----------------Template---------------");

        ReportGenerator pdf = new PDFReportGenerator();
        ReportGenerator html = new HTMLReportGenerator();
        ReportGenerator text = new PlainTextReportGenerator();
        ReportingSystem system = new ReportingSystem(pdf);
        System.out.println("PDF report:");
        system.generateReport();

        system = new ReportingSystem(html);
        System.out.println("HTML report:");
        system.generateReport();

        system = new ReportingSystem(text);
        System.out.println("Plain text report:");
        system.generateReport();

        System.out.println("----------------Iterator---------------");

        Playlist playlist = new Playlist();
        playlist.addSong(new Song("song1", "artist1", "genre1"));
        playlist.addSong(new Song("song2", "artist2", "genre2"));
        playlist.addSong(new Song("song3", "artist3", "genre3"));
        playlist.addSong(new Song("song4", "artist4", "genre2"));

        System.out.println("Sequential Order:");
        Iterator sequentialIterator = playlist.getSequentialIterator();
        while (sequentialIterator.hasNext()) {
            System.out.println(sequentialIterator.next());
        }
        System.out.println();
        System.out.println("Shuffle Order:");
        Iterator shuffleIterator = playlist.getShuffleIterator();
        while (shuffleIterator.hasNext()) {
            System.out.println(shuffleIterator.next());
        }
        System.out.println();
        System.out.println("genre2:");
        Iterator genreFilterIterator = playlist.getGenreFilterIterator("genre2");
        while (genreFilterIterator.hasNext()) {
            System.out.println(genreFilterIterator.next());
        }

    }
}