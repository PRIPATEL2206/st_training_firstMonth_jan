package OopsConcepts.MementoPatternT20;

import java.util.ArrayList;
import java.util.List;

class Memento {
    private String state;

    Memento(String s) {
        state = s;
    }

    String getSavedState() {
        return state;
    }
}

class Caretaker implements Originator {
    String state;

    void set(String s){
        state=s;
    }

    Memento saveToMemento() {
        System.out.println("Saving State to Memento");
        return new Memento(state);
    }

    void restoreFromMemento(Memento memento) {
        state = memento.getSavedState();
        System.out.println("Time restored from Memento: " + state);
    }
}

public class p2 {
public static void main(String[] args) {
    List<Memento> savedTimes = new ArrayList<Memento>();
  
        Caretaker caret = new Caretaker();
  
        //time travel and record the eras
        caret.set("data1");
        savedTimes.add(caret.saveToMemento());
        caret.set("data2");
        savedTimes.add(caret.saveToMemento());
        caret.set("data3");
        savedTimes.add(caret.saveToMemento());
        caret.set("data4");
  
        caret.restoreFromMemento(savedTimes.get(0)); 
}
}
