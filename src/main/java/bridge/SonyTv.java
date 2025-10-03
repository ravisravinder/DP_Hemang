package bridge;

public class SonyTv implements TV {
    public void on() {
        System.out.println("Sony TV is ON");
    }
    public void off() {
        System.out.println("Sony TV is OFF");
    }

    public void changeChannel(int channel) {
        System.out.println("Sony TV: channel " + channel);
    }
}
