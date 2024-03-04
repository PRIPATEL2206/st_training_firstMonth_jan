package bankingSystem;

class Transaction {
    private TransactionType type;
    private double amount;
    private int destinationAccountId; // Applicable for transfers

    public Transaction(TransactionType type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public Transaction(TransactionType type, double amount, int destinationAccountId) {
        this.type = type;
        this.amount = amount;
        this.destinationAccountId = destinationAccountId;
    }

    public TransactionType getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public int getDestinationAccountId() {
        return destinationAccountId;
    }
}
