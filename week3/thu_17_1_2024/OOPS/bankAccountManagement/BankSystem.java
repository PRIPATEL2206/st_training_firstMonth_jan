package bankAccountManagement;

public class BankSystem {
    public static void main(String[] args) {
        // Create a regular bank account
        BankAccount regularAccount = new BankAccount("123456789");
        regularAccount.deposit(1000);
        regularAccount.withdraw(200);
        System.out.println("Regular Account Balance: $" + regularAccount.getBalance());

        // Create a savings account with an interest rate of 5%
        SavingsAccount savingsAccount = new SavingsAccount("987654321", 5.0);
        savingsAccount.deposit(5000);
        savingsAccount.applyInterest();
        System.out.println("Savings Account Balance: $" + savingsAccount.getBalance());
    }
}

