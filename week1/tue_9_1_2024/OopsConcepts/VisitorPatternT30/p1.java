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

public class p1 {
    
}
