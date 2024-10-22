public class DeliveredState implements State{
    private Order order;
    public DeliveredState(Order order){
        this.order = order;
    }
    @Override
    public void payOrder() {
        System.out.println("already paid");
    }

    @Override
    public void shipOrder() {
        System.out.println("already shipped");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Already delivered");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Cannot cancel after delivering");
    }
}
