package decorator;

abstract class DosaDecorator implements Dosa {
    protected  Dosa dosa;
    public DosaDecorator(Dosa dosa){
        this.dosa=dosa;
    }

    public String make(){
        return dosa.make();
    }
}
