package OopsConcepts.StatePatternT21;

interface State{
    String name="";
    void displayName();
}


class Context{
    State state;
    void set(State s){
        state=s;
    }
    void display(){
        state.displayName();
    }
}

public class p1 {    
}
