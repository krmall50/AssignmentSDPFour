public class CancelledState implements State{
    private Order order;
    public CancelledState(Order order){
        this.order = order;
    }
    @Override
    public void payOrder() {
        System.out.println("Cannot pay, order is cancelled");
    }

    @Override
    public void shipOrder() {
        System.out.println("Cannot ship, order is cancelled");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Cannot deliver, order is cancelled");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Cannot cancel, order is cancelled");
    }
}
