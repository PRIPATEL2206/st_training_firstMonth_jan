package OopsConcepts.AbstractFactoryT45;

interface Ui {
    void display();
}

class DesktopUi implements Ui {
    DesktopUi() {
        display();
    }

    @Override
    public void display() {
        System.out.println("Desctop ui displayed");
    }

}

class MobileUi implements Ui {
    MobileUi() {
        display();
    }

    @Override
    public void display() {
        System.out.println("Mobile ui displayed");
    }

}

interface UiFactory {
    DesktopUi createModern();

    MobileUi createVictorian();
}

public class p1 {

}
