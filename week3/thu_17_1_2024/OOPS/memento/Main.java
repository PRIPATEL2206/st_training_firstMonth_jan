package memento;

public class Main {

    public static void main(String[] args) {

        Originator originator = new Originator();
        Caretacker caretacker = new Caretacker();

        originator.setState("State 1");
        originator.setState("State 2");
        caretacker.add(originator.saveStateToMemento());

        originator.setState("State 3");
        caretacker.add(originator.saveStateToMemento());

        originator.setState("State 4");
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(caretacker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(caretacker.get(1));
        System.out.println("Second saved State: " + originator.getState());

    }

}
