package smartContract;


public class TestSmartContract {
    public static void main(String[] args) {
        SmartContract paymentContract = new PaymentContract("Alice", "Bob", 100.0);
        SmartContract tokenTransferContract = new TokenTransferContract("Alice", "Charlie", 50);

        SmartContractExecutor executor = new SmartContractExecutor();

        // Execute PaymentContract
        executor.executeContract(paymentContract);

        // Execute TokenTransferContract
        executor.executeContract(tokenTransferContract);
    }
}
