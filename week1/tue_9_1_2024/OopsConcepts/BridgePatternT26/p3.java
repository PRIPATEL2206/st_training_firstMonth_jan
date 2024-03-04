package OopsConcepts.BridgePatternT26;

abstract class Shape{
   String type;
    void fill(Color c){
        c.fill(type);
    }
}

class Rectangale extends Shape{
    Rectangale(){
        type="Ractangle";
    }
}

public class p3 {
    public static void main(String[] args) {
        Shape s=new Rectangale();
        s.fill(new Red());
        s.fill(new Blue());
    }
}
