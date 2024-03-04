package OopsConcepts.PrototypePatternT48;

class Cow extends AnimalProtoTypePatten{
    Cow() {
        super("Cow");
    }
}
class Buffelo extends AnimalProtoTypePatten{
    Buffelo() {
        super("Buffelo");
    }
}
class Lion extends AnimalProtoTypePatten{
    Lion() {
        super("Lion");
    }
}

public class p2 {
    public static void main(String[] args) {
        Lion l=new Lion();
        Cow c=new Cow();
        Buffelo b=new Buffelo();

        l.clone();
        c.clone();
        b.clone();
    }
}
