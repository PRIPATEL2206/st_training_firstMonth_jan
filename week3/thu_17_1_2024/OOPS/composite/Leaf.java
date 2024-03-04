package composite;

class Leaf implements Component{
    String leafName;

    public Leaf(String name){
        this.leafName = name;
    }

    @Override
    public void printComponentName() {
        System.out.println(leafName);
    }
}

