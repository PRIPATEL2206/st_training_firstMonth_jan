package state;//Example for State pattern


class StateB implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("I am in State B");
        context.setState(this);        
    }

    @Override
    public String toString() {
        return "State B";
    }
}