public class ApprovalChain {
    private Approver chain;
    public ApprovalChain(){
        Approver teamLead = new TeamLead();
        Approver manager = new Manager();
        Approver director = new Director();
        Approver CEO = new CEO();

        teamLead.setNextApprover(manager);
        manager.setNextApprover(director);
        director.setNextApprover(CEO);

        this.chain = teamLead;
    }
    public void processRequest(ExpenseRequest request){
        chain.handleRequest(request);
    }
}
