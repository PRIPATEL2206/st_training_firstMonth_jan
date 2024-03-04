package OopsConcepts.StatePatternT36;

interface State{
    void display();
}


class TrafficLight{
    State state;
    void set(State state){
        this.state=state;
    }
    void displayCurrent(){
        state.display();
    }
} 

public class p1 {
    
}
