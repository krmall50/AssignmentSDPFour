public class CEO extends Approver{
    @Override
    public void handleRequest(ExpenseRequest request) {
        if (request.getAmount() > 10000){
            System.out.println("CEO approved " + request.getAmount() + ", purpose: " + request.getPurpose());
        }
    }
}
