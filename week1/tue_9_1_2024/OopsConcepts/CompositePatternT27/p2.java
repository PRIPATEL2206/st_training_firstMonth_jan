package OopsConcepts.CompositePatternT27;
class Leaf implements Component{
    
    @Override
    public void display() {
        System.out.println("this is leaf node ");
    }

}
class Composite implements Component{
    
    @Override
    public void display() {
        System.out.println("this is Composite node ");
    }

}
public class p2 {
    public static void main(String[] args) {
        Component c=new Composite();
        Component l=new Leaf();
        c.display();
        l.display();
    }
}
