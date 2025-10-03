package adaptor;

public class ChargerAdaptor implements Charger{
    private IndianPlug plug;
    public ChargerAdaptor(IndianPlug plug){
        this.plug=plug;
    }
    @Override
    public void charge() {
        plug.givePower();
        System.out.println("Charging mobile using Adapter");
    }
}
