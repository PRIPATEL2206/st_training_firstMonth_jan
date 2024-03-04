package OopsConcepts.StatePatternT44;

public class p2 {
    public static void main(String[] args) {
        VendingMachine vm= new VendingMachine();
        vm.setState(new NoCoinState());
        vm.display();
        vm.setState(new HasCoinState());
        vm.display();
    }
}