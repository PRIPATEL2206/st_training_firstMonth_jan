package threadSafeObserver;

import java.util.ArrayList;
import java.util.List;

// Observable (Subject)
class Subject {
    private List<Observer> observers = new ArrayList<>();

    public synchronized void addObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public synchronized void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public synchronized void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
