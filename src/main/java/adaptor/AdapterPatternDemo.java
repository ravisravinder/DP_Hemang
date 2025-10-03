package adaptor;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        IndianPlug plug = new IndianPlug();
        Charger charger = new ChargerAdaptor(plug);

        charger.charge();
    }
}
