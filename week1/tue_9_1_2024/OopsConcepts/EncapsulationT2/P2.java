package OopsConcepts.EncapsulationT2;

public class P2 {
    public static void main(String[] args) {
        BankAccount bc1=new BankAccount("1");
        bc1.displayData();
        bc1.deposit(5000);
        bc1.displayData();
        bc1.withdraw(100);
        bc1.displayData();
    }
}

class BankAccount {
    private String accountNumber;
    private int balance;

    BankAccount(String num) {
        this.accountNumber = num;
        this.balance = 0;
    }

    void deposit(int amount) {
        this.balance += amount;
    }

    void withdraw(int amount) {
        this.balance -= Math.min(amount, this.balance);
    }
    void displayData(){
        System.out.println("ACcount No : "+accountNumber);
        System.out.println("ACcount Balance : "+balance);
    }
}