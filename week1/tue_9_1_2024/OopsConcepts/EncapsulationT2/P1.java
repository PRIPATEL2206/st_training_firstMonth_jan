package OopsConcepts.EncapsulationT2;

class BankAccount{
    private String accountNumber ;
    private int balance ;

    BankAccount(String num) {
        this.accountNumber = num;
        this.balance = 0;
    }

    void deposit (int amount){
        this.balance+=amount;
    }
    void withdraw (int amount){
        this.balance-=Math.min(amount, this.balance);
    }
    void displayData(){
        System.out.println("ACcount No : "+accountNumber);
        System.out.println("ACcount Balance : "+balance);
    }
}