package OopsConcepts.AbstractFactoryT45;

class ConcreteUiFactory implements UiFactory{

    @Override
    public DesktopUi createModern() {
        return new DesktopUi();
       }

    @Override
    public MobileUi createVictorian() {
        return new MobileUi();
    }

}

public class p2 {
    public static void main(String[] args) {
        ConcreteUiFactory cuf=new ConcreteUiFactory();
        cuf.createModern();
        cuf.createVictorian();
    }
}
