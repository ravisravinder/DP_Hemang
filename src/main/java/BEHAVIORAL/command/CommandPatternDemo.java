package BEHAVIORAL.command;

public class CommandPatternDemo {
    public static void main(String[] args) {
        TV tv = new TV();
        // Create commands
        Command turnOn = new TurnOnTVCommand(tv);
        Command turnOff = new TurnOffTVCommand(tv);

        // Remote control
        RemoteControl remote = new RemoteControl();

        // Turn on the TV
        remote.setCommand(turnOn);
        remote.pressButton();

        // Turn off the TV
        remote.setCommand(turnOff);
        remote.pressButton();
    }
}
