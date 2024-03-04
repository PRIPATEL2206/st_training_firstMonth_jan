package finiteMachine;

public class TestFiniteState {
    public static void main(String[] args) {
        StateMachine stateMachine = new StateMachine();

        // Start the state machine
        stateMachine.execute(Event.START)
                .thenCompose(ignore -> stateMachine.execute(Event.TRANSITION_TO_STATE1))
                .thenCompose(ignore -> stateMachine.execute(Event.ASYNC_OPERATION_COMPLETE))
                .thenCompose(ignore -> stateMachine.execute(Event.TRANSITION_TO_STATE2))
                .thenCompose(ignore -> stateMachine.execute(Event.ANOTHER_ASYNC_OPERATION_COMPLETE))
                .join(); // Wait for completion
    }
}
