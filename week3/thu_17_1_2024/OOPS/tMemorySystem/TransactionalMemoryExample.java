package tMemorySystem;


public class TransactionalMemoryExample {

    public static void main(String[] args) {
        TransactionalMemorySystem transactionalMemory = new TransactionalMemorySystem();

        // Initial state
        transactionalMemory.write("balance", 100);

        // Transaction 1
        transactionalMemory.beginTransaction();
        transactionalMemory.write("balance", 150);
        System.out.println("Transaction 1 - New balance (uncommitted): " + transactionalMemory.read("balance"));

        // Transaction 2
        transactionalMemory.beginTransaction();
        transactionalMemory.write("balance", 200);
        System.out.println("Transaction 2 - New balance (uncommitted): " + transactionalMemory.read("balance"));

        // Rollback Transaction 2
        transactionalMemory.rollbackTransaction();
        System.out.println("Transaction 2 rolled back - Current balance: " + transactionalMemory.read("balance"));

        // Commit Transaction 1
        transactionalMemory.commitTransaction();
        System.out.println("Transaction 1 committed - Current balance: " + transactionalMemory.read("balance"));
    }
}
