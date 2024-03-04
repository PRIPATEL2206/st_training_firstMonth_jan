package OopsConcepts.ObserverPatternT33;

import java.util.ArrayList;

interface Observer {
    void notifyObserver(int prize);
}

class OserverA implements Observer{

    @Override
    public void notifyObserver(int prize) {
        System.out.println("ObserverB :get stock prize "+prize);
        }

}
class OserverB implements Observer{

    @Override
    public void notifyObserver(int prize) {
        System.out.println("ObserverB :get stock prize "+prize);
        }

}


interface StockMarketInterFace {
    ArrayList<Observer> obsevers = new ArrayList<Observer>();

    void addObserver(Observer sm);

    void removeObserver(Observer sm);

    void notifyObserver(int data);
}

class Subject implements StockMarketInterFace {

    @Override
    public void addObserver(Observer ob) {
        obsevers.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        obsevers.remove(ob);
    }

    @Override
    public void notifyObserver(int prize) {
        for (Observer observer : obsevers) {
            observer.notifyObserver(prize);
        }
    }
}

public class p2 {
public static void main(String[] args) {
    StockMarketInterFace s=new Subject();
    Observer obA=new OserverA();
    Observer obB=new OserverB();

    s.addObserver(obB);
    s.addObserver(obA);

    s.notifyObserver(50);
    s.removeObserver(obB);
    s.notifyObserver(60);
}
}
