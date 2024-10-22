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



    }
}