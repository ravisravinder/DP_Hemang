package bridge;

public class SamsungTV implements TV{
    public void on() {
        System.out.println("Samsung TV is ON");
    }
    public void off() {
        System.out.println("Samsung TV is OFF");
    }
    public void changeChannel(int channel) {
        System.out.println("Samsung TV: channel " + channel);
    }
}
