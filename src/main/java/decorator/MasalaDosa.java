package decorator;

public class MasalaDosa extends  DosaDecorator{
    public MasalaDosa(Dosa dosa) {
        super(dosa);
    }

    public String make(){
        return dosa.make()+" +Masala";
    }
}
