
package OopsConcepts.ObserverPatternT14;

import java.util.ArrayList;
import java.util.List;

interface ObserverInterface {
    void notifyObserver(String data);
}

interface SubjectInterface {
    List<ObserverInterface> obsevers = new ArrayList<>();

    void addObserver(ObserverInterface ob);

    void removeObserver(ObserverInterface ob);

    void notifyObserver(String s);
}


class Observer implements ObserverInterface {

    @Override
    public void notifyObserver(String data) {
        System.out.println("Observer got a data : " + data);
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
    public void notifyObserver(String data) {
        for (ObserverInterface observer : obsevers) {
            observer.notifyObserver(data);
        }
    }
}


public class P1 {
   
}