package decorator;

public class CheeseDosa extends DosaDecorator{
    public CheeseDosa(Dosa dosa) {
        super(dosa);
    }

    public String make(){
        return dosa.make()+" + Cheese";
    }
}
