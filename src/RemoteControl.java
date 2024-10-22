public class RemoteControl {
    private Command[] commandSlots;
    private Command lastCommand;
    public RemoteControl(){
        commandSlots = new Command[5];
        lastCommand = null;
    }
    public void setCommand(int slot, Command command){
        commandSlots[slot] = command;
    }
    public void pressButton(int slot){
        if(commandSlots[slot]!=null){
            commandSlots[slot].execute();
            lastCommand = commandSlots[slot];
        }
    }
    public void pressUndo(){
        if(lastCommand!=null){
            lastCommand.undo();
        }
    }
}
