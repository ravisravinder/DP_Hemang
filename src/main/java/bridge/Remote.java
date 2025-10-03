package bridge;

abstract class Remote {
    protected TV tv;
    public Remote(TV tv){
        this.tv=tv;
    }
    abstract void on();
    abstract void off();
    abstract void setChannel(int channel);
}
