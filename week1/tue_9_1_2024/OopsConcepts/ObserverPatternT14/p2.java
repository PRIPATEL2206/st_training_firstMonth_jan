package OopsConcepts.ObserverPatternT14;

public class p2 {
    public static void main(String[] args) {
        ObserverInterface ob1 = new Observer();
        ObserverInterface ob2=new Observer();

        SubjectInterface s=new Subject();

        s.addObserver(ob1);
        s.addObserver(ob2);

        s.notifyObserver("this is first notification");
        s.notifyObserver("this is second notification");
    }
}
