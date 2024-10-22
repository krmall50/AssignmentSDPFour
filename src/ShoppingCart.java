public class ShoppingCart {
    private PaymentStrategy paymentStrategy;
    public ShoppingCart(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
    public void checkout(double amount){
        paymentStrategy.processPayment(amount);
    }
}
