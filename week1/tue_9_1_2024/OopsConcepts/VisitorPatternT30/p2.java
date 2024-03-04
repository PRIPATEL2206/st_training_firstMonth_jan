package OopsConcepts.VisitorPatternT30;

interface Element{
 void visit(Visitor v);
}

class ElementA implements Element{

    @Override
    public void visit(Visitor v) {
        v.visitElementA(this);
    }
    void visitElementA(){
        System.out.println("visiting Element A");
    }
    
}
class ElementB implements Element{
    @Override
    public void visit(Visitor v) {
        v.visitElementB(this);
    }

    void visitElementB(){
        System.out.println("visiting Element B");
    }
    
}

interface Visitor{
    void visitElementA(ElementA ea);
    void visitElementB(ElementB eb);
}

class ConcreteVisitore implements Visitor{

    @Override
    public void visitElementA(ElementA ea) {
        ea.visitElementA();    
    }

    @Override
    public void visitElementB(ElementB eb) {
       eb.visitElementB();
     }

}

public class p2 {
    public static void main(String[] args) {
        Visitor v=new ConcreteVisitore();
    Element a=new ElementA();
    Element b=new ElementB();

    a.visit(v);
    b.visit(v);
    }
}
