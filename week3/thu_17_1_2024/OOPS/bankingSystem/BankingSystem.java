package bankingSystem;

import java.util.ArrayList;
import java.util.List;

public class BankingSystem {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank();

        // Create customers
        Customer alice = new Customer("Alice");
        Customer bob = new Customer("Bob");

        // Open accounts for customers
        Account aliceAccount = new Account();
        Account bobAccount = new Account();

        alice.openAccount(aliceAccount);
        bob.openAccount(bobAccount);

        // Deposit money into accounts
        aliceAccount.deposit(1000);
        bobAccount.deposit(500);

        // Transfer money between accounts
        aliceAccount.transfer(bobAccount, 200);

        // Check account balances and transaction history
        System.out.println("Alice's Account Balance: $" + aliceAccount.getBalance());
        System.out.println("Bob's Account Balance: $" + bobAccount.getBalance());

        System.out.println("\nAlice's Transaction History:");
        for (Transaction transaction : aliceAccount.getTransactions()) {
            System.out.println(transaction.getType() + ": $" + transaction.getAmount());
        }

        System.out.println("\nBob's Transaction History:");
        for (Transaction transaction : bobAccount.getTransactions()) {
            System.out.println(transaction.getType() + ": $" + transaction.getAmount());
        }
    }
}

