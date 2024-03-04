package smartContract;

class TokenTransferContract implements SmartContract {
    private String from;
    private String to;
    private int amount;

    public TokenTransferContract(String from, String to, int amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    @Override
    public void execute() {
        System.out.println("Executing TokenTransferContract: " + from + " transfers " + amount + " tokens to " + to);
        // Implement token transfer logic here
    }
}
