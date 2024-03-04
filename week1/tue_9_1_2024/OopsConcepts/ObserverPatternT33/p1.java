package OopsConcepts.ObserverPatternT33;

import java.util.ArrayList;

interface Observer {
    void notifyObserver(int prize);
}


interface StockMarketInterFace {
    ArrayList<Observer> obsevers = new ArrayList<Observer>();

    void addObserver(Observer sm);

    void removeObserver(Observer sm);

    void notifyObserver(int data);
}


public class p1 {

}
