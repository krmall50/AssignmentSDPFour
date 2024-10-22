public class PayPalPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Paypal payment: " + amount + "KZT");
    }
}
