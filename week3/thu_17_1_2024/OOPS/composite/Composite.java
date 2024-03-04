package composite;

import java.util.ArrayList;
import java.util.List;

class Composite implements Component{

    String compositeName;

    List<Component> leaves;

    public Composite(String compositeName){
        this.compositeName = compositeName;
        this.leaves = new ArrayList<>();
    }

    @Override
    public void printComponentName() {
        leaves.forEach(Component::printComponentName);
    }

    public void addLeaf(Component leaf){
        leaves.add(leaf);
    }

    public void removeLeaf(Component leaf){
        leaves.remove(leaf);
    }

}