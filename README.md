1. Strategy Pattern: Payment Processing System

Created a `PaymentStrategy` interface with a `processPayment(double amount)` method, to define how different payment methods will process payments.
Implemented concrete strategy classes like `CreditCardPayment`, `PayPalPayment`, and `CryptoPayment`, each with its own implementation of the `processPayment` method.
Created a `ShoppingCart` class that holds items and uses a `PaymentStrategy` to process the total amount.
Added a method in `ShoppingCart` to change the payment strategy in runtime.
Demonstrated in the `Main` how the system can process payments using various strategies, showing the runtime flexibility of switching between credit card, paypal, and crypto.

2. Observer Pattern: Weather Monitoring System

Created a `WeatherStation` class that acts as the subject, with methods to update weather data and notify all observers.
Created a `WeatherDisplay` interface with an `update` method to update display information.
Implemented concrete display classes like `CurrentConditionsDisplay`, `StatisticsDisplay`, and `ForecastDisplay`, each updating based on the weather data.
Created a `WeatherData` class to store and manage the weather station and its displays.
Demonstrated the system in the `Main` by updating weather data and showing how all display devices reflect the changes.

3. Command Pattern: Remote Control for Smart Home Devices

Created a `Command` interface with methods like `execute()` and `undo()`.
Implemented concrete command classes like `TurnTVOn`, `SetVolume`, and `DimLights`, each encapsulating a specific action for smart devices.
Created receiver classes such as `TV`, `Stereo`, and `Light`, each representing smart home devices with operations that can be controlled.
Created a `RemoteControl` class that can hold and execute commands for multiple devices, with an undo button to reverse the last command.
Demonstrated in the `Main` how the universal remote can operate different devices and use the undo feature.

4. State Pattern: Order Processing System

Created a `State` interface with methods for actions like `payOrder()`, `shipOrder()`, `deliverOrder()`, and `cancelOrder()`.
Implemented concrete state classes, each representing the order’s current state.
Created an `Order` class that maintains the current state and takes actions to the corresponding state object.
Implemented methods in the `Order` class to transition between states.
Demonstrated in the `Main` how an order's behavior changes as it moves through different states.

5. Chain of Responsibility Pattern: Expense Approval System

Created a `Approver` class with a `setNext(Approver next)` method to link to the next approver in the chain, and `approveExpense(double amount)` method to handle requests.
Implemented concrete approvers like `TeamLead`, `Manager`, `Director`, and `CEO`.
Created an `ExpenseRequest` class with properties like `amount` and `purpose`.
Built an `ApprovalChain` class to set up the chain of approvers and process requests.
Demonstrated in the `Main` how requests are passed through the chain until an approver can handle the request.

6. Mediator Pattern: Chat Room Application

Created a `ChatMediator` interface with methods for sending messages and adding users to a chat room.
Implemented a `ChatRoom` class that acts as the mediator.
Created an abstract `User` class with methods for sending and receiving messages with the mediator.
Created concrete `ChatUser` classes `RegularUser` and `PremiumUser`.
Demonstrated in the `Main` how users can communicate through the chat room by sending messages with the mediator.

7. Memento Pattern: Document Version Control System

Created a `Document` class with methods to edit content and create or restore mementos.
Implemented a `DocumentVersion` class  to store the document’s state at the specific point in time.
Created a `VersionControl` class to manage saving and restoring document versions.
Implemented methods in `VersionControl` to list all versions and restore specific versions.
Demonstrated in the `Main` how different versions of a document can be saved and restored.

8. Visitor Pattern: Shape Area Calculator

Created a `Shape` interface with `accept(Visitor visitor)` method to accept visitors for each shape.
Implemented concrete shape classes `Circle`, `Rectangle`, and `Triangle`, each accepting a visitor.
Created a `Visitor` interface with visit methods for each shape type.
Implemented an `AreaCalculator` visitor that calculates the area for each shape using its specific visit method.
Demonstrated in the `Main` how the area of different shapes is calculated using the visitor pattern.

9. Template Method Pattern: Report Generation System

Created a `ReportGenerator` class with a `generateReport()` template method.
Created abstract methods `formatHeader()`, `formatBody()`, and `formatFooter()` to allow customization of different report formats.
Implemented concrete report generators `PDFReportGenerator` and `HTMLReportGenerator`.
Created a `ReportingSystem` class to use different report generators.
Demonstrated in the `Main` how various types of reports are generated.

10. Iterator Pattern: Playlist Management System

Created a `Playlist` class to store a collection of `Song` objects.
Implemented iterator classes like `SequentialIterator`, `ShuffleIterator` and`GenreFilterIterator`, each providing different traversal logic.
Ensured each iterator has `hasNext()` and `next()` methods.
Added methods in the `Playlist` class to retrieve different iterators for sequential, shuffled, or genre-filtered traversal.
Demonstrated in the `Main` how songs can be traversed in different orders using the various iterators.
