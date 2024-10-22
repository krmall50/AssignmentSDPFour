public class CryptoPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Crypto payment: " + amount + "KZT");
    }
}
