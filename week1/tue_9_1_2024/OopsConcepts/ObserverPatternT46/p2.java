package OopsConcepts.ObserverPatternT46;

public class p2 {
    public static void main(String[] args) {
        ObserverInterface ob1 = new Observer();
        ObserverInterface ob2=new Observer();

        SubjectInterface s=new Subject();

        s.addObserver(ob1);
        s.addObserver(ob2);

        s.notifyObserver("23","34");
        s.notifyObserver("13","32");
    }
}
