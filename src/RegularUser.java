public class RegularUser extends User{
    public RegularUser(ChatMediator chatMediator, String name){
        super(chatMediator, name);
    }
    @Override
    public void send(String message) {
        System.out.println("Regular user " + this.name + " sends: " + message);
        chatMediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Regular user" + this.name + " received: " + message);
    }
}
