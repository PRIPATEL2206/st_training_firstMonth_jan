package bankingSystem;

import java.util.ArrayList;
import java.util.List;

class Account {
    private static int nextAccountId = 1;

    private int id;
    private double balance;
    private List<Transaction> transactions;

    public Account() {
        this.id = nextAccountId++;
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction(TransactionType.DEPOSIT, amount));
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions.add(new Transaction(TransactionType.WITHDRAWAL, amount));
            return true; // Withdrawal successful
        } else {
            return false; // Insufficient funds
        }
    }

    public void transfer(Account destinationAccount, double amount) {
        if (withdraw(amount)) {
            destinationAccount.deposit(amount);
            transactions.add(new Transaction(TransactionType.TRANSFER, amount, destinationAccount.getId()));
        }
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
