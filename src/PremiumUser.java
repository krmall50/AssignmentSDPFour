public class PremiumUser extends User{
    public PremiumUser(ChatMediator chatMediator, String name){
        super(chatMediator, name);
    }
    @Override
    public void send(String message) {
        System.out.println("Premium user " + this.name + " sends: " + message);
        chatMediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Premium user" + this.name + " received: " + message);
    }
}
