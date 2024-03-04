package memento;

import java.util.ArrayList;
import java.util.List;

class Caretacker{
    private List<Memento> mementos = new ArrayList<Memento>();

    public void add(Memento memento){
        mementos.add(memento);
    }

    public Memento get(int index){
        return mementos.get(index);
    }
}
