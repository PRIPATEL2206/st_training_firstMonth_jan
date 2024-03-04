package state;//Example for State pattern

public class Main {
    
    public static void main(String[] args) {
        
        Context context = new Context();

        StateA stateA = new StateA();
        stateA.doAction(context);
        System.out.println(context.getState());

        StateB stateB = new StateB();
        stateB.doAction(context);
        System.out.println(context.getState());

    }

}


