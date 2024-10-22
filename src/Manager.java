public class Manager extends Approver{
    @Override
    public void handleRequest(ExpenseRequest request) {
        if (request.getAmount() <= 5000){
            System.out.println("Manager approved " + request.getAmount() + ", purpose: " + request.getPurpose());
        }
        else if(nextApprover != null){
            nextApprover.handleRequest(request);
        }
    }
}
