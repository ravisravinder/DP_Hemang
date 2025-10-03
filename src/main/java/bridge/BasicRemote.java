package bridge;

public class BasicRemote extends Remote{

    BasicRemote(TV tv){
        super(tv);
    }

    @Override
    void on() {
        tv.on();
    }

    @Override
    void off() {
        tv.off();
    }

    @Override
    void setChannel(int channel) {
        tv.changeChannel(channel);
    }
}
