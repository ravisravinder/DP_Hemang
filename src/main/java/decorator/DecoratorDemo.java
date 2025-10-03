package decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Dosa dosa = new PlainDosa();
        System.out.println(dosa.make());

        Dosa masalaDosa = new MasalaDosa(new PlainDosa());
        System.out.println(masalaDosa.make());

        Dosa cheeseDosa = new CheeseDosa(new PlainDosa() );
        System.out.println(cheeseDosa.make());
        
        Dosa cheeseMasala = new CheeseDosa(new MasalaDosa(new PlainDosa()));
        System.out.println(cheeseMasala.make());
    }
}
