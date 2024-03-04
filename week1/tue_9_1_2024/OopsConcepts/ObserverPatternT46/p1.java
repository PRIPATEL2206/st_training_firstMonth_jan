package OopsConcepts.ObserverPatternT46;
import java.util.ArrayList;
import java.util.List;

interface ObserverInterface {
    void notifyObserver(String w,String h);
}

interface SubjectInterface {
    List<ObserverInterface> obsevers = new ArrayList<>();

    void addObserver(ObserverInterface ob);

    void removeObserver(ObserverInterface ob);

    void notifyObserver(String w,String h);
}


class Observer implements ObserverInterface {

    @Override
    public void notifyObserver(String t,String h) {
        System.out.println("temperature : "+t+" Humidity : "+h);
    }

}

class Subject implements SubjectInterface {

    @Override
    public void addObserver(ObserverInterface ob) {
        obsevers.add(ob);
    }

    @Override
    public void removeObserver(ObserverInterface ob) {
        obsevers.remove(ob);
    }

    @Override
    public void notifyObserver(String t,String h) {
        for (ObserverInterface observer : obsevers) {
            observer.notifyObserver(t,h);
        }
    }
}

public class p1 {
    
}
