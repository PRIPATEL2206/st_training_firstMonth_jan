package OopsConcepts.BridgePatternT40;


class Rectangale extends Shape{

    Rectangale() {
        super("Rectangale");
    }

}

class Circule extends Shape{

    Circule() {
        super("Circule");
    }

}

public class p2 {
    public static void main(String[] args) {
        Engines e1=new Engines("i7 mark2");
        Engines e2=new Engines("i11 mark15");
        e1.render(new Rectangale());
        e1.render(new Circule());
        e2.render(new Rectangale());
        e2.render(new Circule());
    }
}
