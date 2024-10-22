public class NewState implements State{
    private Order order;
    public NewState(Order order){
        this.order = order;
    }
    @Override
    public void payOrder() {
        System.out.println("order is Paid");
        order.setState(order.getPaidState());
    }

    @Override
    public void shipOrder() {
        System.out.println("error, payment required");
    }

    @Override
    public void deliverOrder() {
        System.out.println("error, payment required");
    }

    @Override
    public void cancelOrder() {
        System.out.println("order cancelled");
        order.setState(order.getCancelledState());
    }
}
