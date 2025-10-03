package bridge;

public class MainTV {
    public static void main(String[] args) {
        TV sony = new SonyTv();
        Remote sonyRemote = new BasicRemote(sony);
        sonyRemote.on();
        sonyRemote.off();
        sonyRemote.setChannel(5);

        System.out.println("--------------");
        TV samsung = new SamsungTV();
        Remote samsungRemote = new BasicRemote(samsung);
        samsungRemote.on();
        samsungRemote.setChannel(6);
        samsungRemote.off();
    }
}
