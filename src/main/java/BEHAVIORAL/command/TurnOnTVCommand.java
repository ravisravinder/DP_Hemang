package BEHAVIORAL.command;

// Command to turn on TV

public class TurnOnTVCommand implements Command{

    private TV tv;

    public TurnOnTVCommand(TV tv){
        this.tv=tv;
    }
    public void execute(){
        tv.turnOn();
    }

}
