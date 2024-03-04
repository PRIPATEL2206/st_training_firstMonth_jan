package OopsConcepts.InterfaceT12;

public class P2 {
    
}

interface Drawable{
 void draw();
}

class Circle implements Drawable{

    @Override
    public void draw() {
        System.out.println("Circule is drawn");
    }
    
} 
class Rectangle implements Drawable{

    @Override
    public void draw() {
        System.out.println("Rectangle is drawn");
    }
    
} 