package smartContract;

// Concrete Contract Classes
class PaymentContract implements SmartContract {
    private String sender;
    private String recipient;
    private double amount;

    public PaymentContract(String sender, String recipient, double amount) {
        this.sender = sender;
        this.recipient = recipient;
        this.amount = amount;
    }

    @Override
    public void execute() {
        System.out.println("Executing PaymentContract: " + sender + " pays " + recipient + " $" + amount);
        // Implement payment logic here
    }
}
