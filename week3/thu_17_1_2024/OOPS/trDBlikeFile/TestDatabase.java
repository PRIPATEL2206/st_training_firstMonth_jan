package trDBlikeFile;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class TestDatabase {

    public static void main(String[] args) {
        TransactionalFileSystemWithDatabase fileSystem = new TransactionalFileSystemWithDatabase();

        // Perform transactions
        fileSystem.write("file1.txt", "Content of file1");
        fileSystem.write("file2.txt", "Content of file2");

        // Query for files containing a specific word
        String result = fileSystem.query("Content");
        System.out.println("Query Result: " + result);

        // Delete a file
        fileSystem.delete("file1.txt");

        // Read the content of a file
        String content = fileSystem.read("file1.txt");
        System.out.println("Content of file1 after deletion: " + content);
    }
}
