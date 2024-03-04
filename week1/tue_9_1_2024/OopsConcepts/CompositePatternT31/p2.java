package OopsConcepts.CompositePatternT31;

import java.util.ArrayList;
import java.util.List;

class Leaf implements Component{
    String name;
    Leaf(String n){
        name=n;
    }
    @Override
    public void addComponent(Component c) {
        throw new UnsupportedOperationException("Unimplemented method 'addComponent'");
    }
    @Override
    public void removeComponent(Component c) {
        throw new UnsupportedOperationException("Unimplemented method 'removeComponent'");
    }
 

}
class Composite implements Component{
    String name;
    List<Component> children=new ArrayList<>();
   
    @Override
    public void addComponent(Component c) {
        children.add(c);
         }

    @Override
    public void removeComponent(Component c) {
        children.remove(c);
         }

}

public class p2 {
    public static void main(String[] args) {
        Leaf leaf1 = new Leaf("A");
        Leaf leaf2 = new Leaf("B");
        Leaf leaf3 = new Leaf("C");

        Composite composite = new Composite();
        composite.addComponent(leaf1);
        composite.addComponent(leaf2);

        Composite composite2 = new Composite();
        composite2.addComponent(leaf3);

        composite.addComponent(composite2);
    }
}
