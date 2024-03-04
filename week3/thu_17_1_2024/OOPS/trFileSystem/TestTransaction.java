package trFileSystem;


public class TestTransaction {
    public static void main(String[] args) {
        TransactionalFileSystem fileSystem = new TransactionalFileSystem();

        long transactionId = fileSystem.beginTransaction();

        TransactionalFileSystem.TransactionalFile file = fileSystem.createFile("/example.txt", "Initial content");
        fileSystem.getFile("/example.txt").beginTransaction(transactionId);

        // Modify the file content within the transaction
        file.setContent("Modified content");

        // Rollback the transaction
        fileSystem.rollbackTransaction(transactionId);

        // Check if the content was rolled back
        System.out.println(fileSystem.getFile("/example.txt").getContent());  // Should print "Initial content"
    }
}
