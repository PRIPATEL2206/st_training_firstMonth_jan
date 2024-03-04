package OopsConcepts.StatePatternT36;

class Red implements State{

    String name="Red";
    @Override
    public void display() {
        System.out.println("currently "+name+" is active");
    
    }
}
class Yellow implements State{

    String name="Yellow";
    @Override
    public void display() {
        System.out.println("currently "+name+" is active");
    
    }
}
class Green implements State{

    String name="Green";
    @Override
    public void display() {
        System.out.println("currently "+name+" is active");
    
    }
}

public class p2 {
    public static void main(String[] args) {
        TrafficLight tl=new TrafficLight();
        State r=new Red();
        State y=new Yellow();
        State g=new Green();
        tl.set(r);
        tl.displayCurrent();
        tl.set(y);
        tl.displayCurrent();
        tl.set(g);
        tl.displayCurrent();
    }
}
