package state;//Example for State pattern


class StateA implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("I am in State A");
        context.setState(this);
        
    }

    @Override
    public String toString() {
        return "State A";
    }
}

