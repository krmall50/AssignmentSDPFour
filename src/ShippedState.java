import java.util.SortedMap;

public class ShippedState implements State{
    private Order order;
    public ShippedState(Order order){
        this.order = order;
    }
    @Override
    public void payOrder() {
        System.out.println("Already paid");
    }

    @Override
    public void shipOrder() {
        System.out.println("already shipped");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Order is delivered");
        order.setState(order.getDeliveredState());
    }

    @Override
    public void cancelOrder() {
        System.out.println("cannot cancel after shipping");
    }
}
