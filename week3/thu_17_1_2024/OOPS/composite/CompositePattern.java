package composite;

public class CompositePattern {

    public static void main(String[] args) {
        Component l1 = new Leaf("composite.Leaf #1");
        Component l2 = new Leaf("composite.Leaf #2");

        Composite composite = new Composite("composite.Composite #1");

        composite.addLeaf(l1);
        composite.addLeaf(l2);

        composite.printComponentName();
    }
}
