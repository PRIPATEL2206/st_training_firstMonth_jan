package OopsConcepts.StatePatternT44;

interface State {
    void display();
}

class NoCoinState implements State{
    public void display(){
        System.out.println("current state is noCoinState");
    }
}

class HasCoinState implements State{
    public void display(){
        System.out.println("current state is VendingMachine");
    }
}

class VendingMachine{
    State currentState;
    void setState(State s){
        currentState=s;
    }
    void display(){
        currentState.display();
    }
}

public class p1 {
    
}
