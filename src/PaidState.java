public class PaidState implements State{
    private Order order;
    public PaidState(Order order){
        this.order = order;
    }
    @Override
    public void payOrder() {
        System.out.println("Already paid");
    }

    @Override
    public void shipOrder() {
        System.out.println("order is shipped");
        order.setState(order.getShippedState());
    }

    @Override
    public void deliverOrder() {
        System.out.println("Cannot be delivered now");
    }

    @Override
    public void cancelOrder() {
        System.out.println("order is cancelled");
        order.setState(order.getCancelledState());
    }
}
