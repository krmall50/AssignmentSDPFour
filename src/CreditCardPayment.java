public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Credit card payment: " + amount + "KZT");
    }
}
