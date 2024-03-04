package OopsConcepts.StatePatternT21;

interface State{
    String name="";
    void displayName();
}

class StateA implements State{

    String name="State A";
    @Override
    public void displayName() {
       System.out.println(name);
    }
}
class StateB implements State{

    String name="State B";
    @Override
    public void displayName() {
       System.out.println(name);
    }
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

public class p2 {

    public static void main(String[] args) {
        Context c1=new Context();
        c1.set(new StateA());
        c1.display();
        c1.set(new StateB());
        c1.display();

    
    }
    
}
